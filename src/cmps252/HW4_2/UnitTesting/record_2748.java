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

@Tag("1")
class Record_2748 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2748: FirstName is Danna")
	void FirstNameOfRecord2748() {
		assertEquals("Danna", customers.get(2747).getFirstName());
	}

	@Test
	@DisplayName("Record 2748: LastName is Ally")
	void LastNameOfRecord2748() {
		assertEquals("Ally", customers.get(2747).getLastName());
	}

	@Test
	@DisplayName("Record 2748: Company is Anderson, Joseph P Jr")
	void CompanyOfRecord2748() {
		assertEquals("Anderson, Joseph P Jr", customers.get(2747).getCompany());
	}

	@Test
	@DisplayName("Record 2748: Address is 1356 Union Grove Rd")
	void AddressOfRecord2748() {
		assertEquals("1356 Union Grove Rd", customers.get(2747).getAddress());
	}

	@Test
	@DisplayName("Record 2748: City is Terre Hill")
	void CityOfRecord2748() {
		assertEquals("Terre Hill", customers.get(2747).getCity());
	}

	@Test
	@DisplayName("Record 2748: County is Lancaster")
	void CountyOfRecord2748() {
		assertEquals("Lancaster", customers.get(2747).getCounty());
	}

	@Test
	@DisplayName("Record 2748: State is PA")
	void StateOfRecord2748() {
		assertEquals("PA", customers.get(2747).getState());
	}

	@Test
	@DisplayName("Record 2748: ZIP is 17581")
	void ZIPOfRecord2748() {
		assertEquals("17581", customers.get(2747).getZIP());
	}

	@Test
	@DisplayName("Record 2748: Phone is 717-445-1980")
	void PhoneOfRecord2748() {
		assertEquals("717-445-1980", customers.get(2747).getPhone());
	}

	@Test
	@DisplayName("Record 2748: Fax is 717-445-5956")
	void FaxOfRecord2748() {
		assertEquals("717-445-5956", customers.get(2747).getFax());
	}

	@Test
	@DisplayName("Record 2748: Email is danna@ally.com")
	void EmailOfRecord2748() {
		assertEquals("danna@ally.com", customers.get(2747).getEmail());
	}

	@Test
	@DisplayName("Record 2748: Web is http://www.dannaally.com")
	void WebOfRecord2748() {
		assertEquals("http://www.dannaally.com", customers.get(2747).getWeb());
	}
}
