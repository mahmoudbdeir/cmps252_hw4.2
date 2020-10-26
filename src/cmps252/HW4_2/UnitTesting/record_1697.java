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

@Tag("19")
class Record_1697 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1697: FirstName is Sylvester")
	void FirstNameOfRecord1697() {
		assertEquals("Sylvester", customers.get(1696).getFirstName());
	}

	@Test
	@DisplayName("Record 1697: LastName is Drahos")
	void LastNameOfRecord1697() {
		assertEquals("Drahos", customers.get(1696).getLastName());
	}

	@Test
	@DisplayName("Record 1697: Company is Southwest Abrasives & Equip")
	void CompanyOfRecord1697() {
		assertEquals("Southwest Abrasives & Equip", customers.get(1696).getCompany());
	}

	@Test
	@DisplayName("Record 1697: Address is 4607 S Windermere St")
	void AddressOfRecord1697() {
		assertEquals("4607 S Windermere St", customers.get(1696).getAddress());
	}

	@Test
	@DisplayName("Record 1697: City is Englewood")
	void CityOfRecord1697() {
		assertEquals("Englewood", customers.get(1696).getCity());
	}

	@Test
	@DisplayName("Record 1697: County is Arapahoe")
	void CountyOfRecord1697() {
		assertEquals("Arapahoe", customers.get(1696).getCounty());
	}

	@Test
	@DisplayName("Record 1697: State is CO")
	void StateOfRecord1697() {
		assertEquals("CO", customers.get(1696).getState());
	}

	@Test
	@DisplayName("Record 1697: ZIP is 80110")
	void ZIPOfRecord1697() {
		assertEquals("80110", customers.get(1696).getZIP());
	}

	@Test
	@DisplayName("Record 1697: Phone is 303-783-5690")
	void PhoneOfRecord1697() {
		assertEquals("303-783-5690", customers.get(1696).getPhone());
	}

	@Test
	@DisplayName("Record 1697: Fax is 303-783-8922")
	void FaxOfRecord1697() {
		assertEquals("303-783-8922", customers.get(1696).getFax());
	}

	@Test
	@DisplayName("Record 1697: Email is sylvester@drahos.com")
	void EmailOfRecord1697() {
		assertEquals("sylvester@drahos.com", customers.get(1696).getEmail());
	}

	@Test
	@DisplayName("Record 1697: Web is http://www.sylvesterdrahos.com")
	void WebOfRecord1697() {
		assertEquals("http://www.sylvesterdrahos.com", customers.get(1696).getWeb());
	}
}
