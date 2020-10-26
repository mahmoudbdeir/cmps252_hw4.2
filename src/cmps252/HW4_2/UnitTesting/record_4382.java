package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("25")
class Record_4382 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4382: FirstName is Benny")
	void FirstNameOfRecord4382() {
		assertEquals("Benny", customers.get(4381).getFirstName());
	}

	@Test
	@DisplayName("Record 4382: LastName is Morten")
	void LastNameOfRecord4382() {
		assertEquals("Morten", customers.get(4381).getLastName());
	}

	@Test
	@DisplayName("Record 4382: Company is Crenshaw, Stuart L Iii")
	void CompanyOfRecord4382() {
		assertEquals("Crenshaw, Stuart L Iii", customers.get(4381).getCompany());
	}

	@Test
	@DisplayName("Record 4382: Address is 161 S Mckean St")
	void AddressOfRecord4382() {
		assertEquals("161 S Mckean St", customers.get(4381).getAddress());
	}

	@Test
	@DisplayName("Record 4382: City is Kittanning")
	void CityOfRecord4382() {
		assertEquals("Kittanning", customers.get(4381).getCity());
	}

	@Test
	@DisplayName("Record 4382: County is Armstrong")
	void CountyOfRecord4382() {
		assertEquals("Armstrong", customers.get(4381).getCounty());
	}

	@Test
	@DisplayName("Record 4382: State is PA")
	void StateOfRecord4382() {
		assertEquals("PA", customers.get(4381).getState());
	}

	@Test
	@DisplayName("Record 4382: ZIP is 16201")
	void ZIPOfRecord4382() {
		assertEquals("16201", customers.get(4381).getZIP());
	}

	@Test
	@DisplayName("Record 4382: Phone is 724-543-4297")
	void PhoneOfRecord4382() {
		assertEquals("724-543-4297", customers.get(4381).getPhone());
	}

	@Test
	@DisplayName("Record 4382: Fax is 724-543-8497")
	void FaxOfRecord4382() {
		assertEquals("724-543-8497", customers.get(4381).getFax());
	}

	@Test
	@DisplayName("Record 4382: Email is benny@morten.com")
	void EmailOfRecord4382() {
		assertEquals("benny@morten.com", customers.get(4381).getEmail());
	}

	@Test
	@DisplayName("Record 4382: Web is http://www.bennymorten.com")
	void WebOfRecord4382() {
		assertEquals("http://www.bennymorten.com", customers.get(4381).getWeb());
	}
}
