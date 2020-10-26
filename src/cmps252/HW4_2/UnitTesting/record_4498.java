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

@Tag("32")
class Record_4498 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4498: FirstName is Loretta")
	void FirstNameOfRecord4498() {
		assertEquals("Loretta", customers.get(4497).getFirstName());
	}

	@Test
	@DisplayName("Record 4498: LastName is Davila")
	void LastNameOfRecord4498() {
		assertEquals("Davila", customers.get(4497).getLastName());
	}

	@Test
	@DisplayName("Record 4498: Company is Duane Etheridge Construction")
	void CompanyOfRecord4498() {
		assertEquals("Duane Etheridge Construction", customers.get(4497).getCompany());
	}

	@Test
	@DisplayName("Record 4498: Address is 3915 Market St")
	void AddressOfRecord4498() {
		assertEquals("3915 Market St", customers.get(4497).getAddress());
	}

	@Test
	@DisplayName("Record 4498: City is Camp Hill")
	void CityOfRecord4498() {
		assertEquals("Camp Hill", customers.get(4497).getCity());
	}

	@Test
	@DisplayName("Record 4498: County is Cumberland")
	void CountyOfRecord4498() {
		assertEquals("Cumberland", customers.get(4497).getCounty());
	}

	@Test
	@DisplayName("Record 4498: State is PA")
	void StateOfRecord4498() {
		assertEquals("PA", customers.get(4497).getState());
	}

	@Test
	@DisplayName("Record 4498: ZIP is 17011")
	void ZIPOfRecord4498() {
		assertEquals("17011", customers.get(4497).getZIP());
	}

	@Test
	@DisplayName("Record 4498: Phone is 717-763-9604")
	void PhoneOfRecord4498() {
		assertEquals("717-763-9604", customers.get(4497).getPhone());
	}

	@Test
	@DisplayName("Record 4498: Fax is 717-763-1344")
	void FaxOfRecord4498() {
		assertEquals("717-763-1344", customers.get(4497).getFax());
	}

	@Test
	@DisplayName("Record 4498: Email is loretta@davila.com")
	void EmailOfRecord4498() {
		assertEquals("loretta@davila.com", customers.get(4497).getEmail());
	}

	@Test
	@DisplayName("Record 4498: Web is http://www.lorettadavila.com")
	void WebOfRecord4498() {
		assertEquals("http://www.lorettadavila.com", customers.get(4497).getWeb());
	}
}
