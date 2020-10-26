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

@Tag("31")
class Record_2074 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2074: FirstName is Bertram")
	void FirstNameOfRecord2074() {
		assertEquals("Bertram", customers.get(2073).getFirstName());
	}

	@Test
	@DisplayName("Record 2074: LastName is Prinn")
	void LastNameOfRecord2074() {
		assertEquals("Prinn", customers.get(2073).getLastName());
	}

	@Test
	@DisplayName("Record 2074: Company is Farmers Marine Copper Wks Inc")
	void CompanyOfRecord2074() {
		assertEquals("Farmers Marine Copper Wks Inc", customers.get(2073).getCompany());
	}

	@Test
	@DisplayName("Record 2074: Address is 4400 Geraldine Ave")
	void AddressOfRecord2074() {
		assertEquals("4400 Geraldine Ave", customers.get(2073).getAddress());
	}

	@Test
	@DisplayName("Record 2074: City is Saint Louis")
	void CityOfRecord2074() {
		assertEquals("Saint Louis", customers.get(2073).getCity());
	}

	@Test
	@DisplayName("Record 2074: County is Saint Louis City")
	void CountyOfRecord2074() {
		assertEquals("Saint Louis City", customers.get(2073).getCounty());
	}

	@Test
	@DisplayName("Record 2074: State is MO")
	void StateOfRecord2074() {
		assertEquals("MO", customers.get(2073).getState());
	}

	@Test
	@DisplayName("Record 2074: ZIP is 63115")
	void ZIPOfRecord2074() {
		assertEquals("63115", customers.get(2073).getZIP());
	}

	@Test
	@DisplayName("Record 2074: Phone is 314-389-1015")
	void PhoneOfRecord2074() {
		assertEquals("314-389-1015", customers.get(2073).getPhone());
	}

	@Test
	@DisplayName("Record 2074: Fax is 314-389-2618")
	void FaxOfRecord2074() {
		assertEquals("314-389-2618", customers.get(2073).getFax());
	}

	@Test
	@DisplayName("Record 2074: Email is bertram@prinn.com")
	void EmailOfRecord2074() {
		assertEquals("bertram@prinn.com", customers.get(2073).getEmail());
	}

	@Test
	@DisplayName("Record 2074: Web is http://www.bertramprinn.com")
	void WebOfRecord2074() {
		assertEquals("http://www.bertramprinn.com", customers.get(2073).getWeb());
	}
}
