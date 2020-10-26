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

@Tag("17")
class Record_1627 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1627: FirstName is Maureen")
	void FirstNameOfRecord1627() {
		assertEquals("Maureen", customers.get(1626).getFirstName());
	}

	@Test
	@DisplayName("Record 1627: LastName is Klingman")
	void LastNameOfRecord1627() {
		assertEquals("Klingman", customers.get(1626).getLastName());
	}

	@Test
	@DisplayName("Record 1627: Company is J Gatarz & Sons Inc")
	void CompanyOfRecord1627() {
		assertEquals("J Gatarz & Sons Inc", customers.get(1626).getCompany());
	}

	@Test
	@DisplayName("Record 1627: Address is Red Hill Rd")
	void AddressOfRecord1627() {
		assertEquals("Red Hill Rd", customers.get(1626).getAddress());
	}

	@Test
	@DisplayName("Record 1627: City is Pennsburg")
	void CityOfRecord1627() {
		assertEquals("Pennsburg", customers.get(1626).getCity());
	}

	@Test
	@DisplayName("Record 1627: County is Montgomery")
	void CountyOfRecord1627() {
		assertEquals("Montgomery", customers.get(1626).getCounty());
	}

	@Test
	@DisplayName("Record 1627: State is PA")
	void StateOfRecord1627() {
		assertEquals("PA", customers.get(1626).getState());
	}

	@Test
	@DisplayName("Record 1627: ZIP is 18073")
	void ZIPOfRecord1627() {
		assertEquals("18073", customers.get(1626).getZIP());
	}

	@Test
	@DisplayName("Record 1627: Phone is 215-541-9820")
	void PhoneOfRecord1627() {
		assertEquals("215-541-9820", customers.get(1626).getPhone());
	}

	@Test
	@DisplayName("Record 1627: Fax is 215-541-4478")
	void FaxOfRecord1627() {
		assertEquals("215-541-4478", customers.get(1626).getFax());
	}

	@Test
	@DisplayName("Record 1627: Email is maureen@klingman.com")
	void EmailOfRecord1627() {
		assertEquals("maureen@klingman.com", customers.get(1626).getEmail());
	}

	@Test
	@DisplayName("Record 1627: Web is http://www.maureenklingman.com")
	void WebOfRecord1627() {
		assertEquals("http://www.maureenklingman.com", customers.get(1626).getWeb());
	}
}
