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

@Tag("11")
class Record_1140 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1140: FirstName is Consuelo")
	void FirstNameOfRecord1140() {
		assertEquals("Consuelo", customers.get(1139).getFirstName());
	}

	@Test
	@DisplayName("Record 1140: LastName is Provow")
	void LastNameOfRecord1140() {
		assertEquals("Provow", customers.get(1139).getLastName());
	}

	@Test
	@DisplayName("Record 1140: Company is Waymire Drum Co")
	void CompanyOfRecord1140() {
		assertEquals("Waymire Drum Co", customers.get(1139).getCompany());
	}

	@Test
	@DisplayName("Record 1140: Address is 401 Hackensack Ave")
	void AddressOfRecord1140() {
		assertEquals("401 Hackensack Ave", customers.get(1139).getAddress());
	}

	@Test
	@DisplayName("Record 1140: City is Hackensack")
	void CityOfRecord1140() {
		assertEquals("Hackensack", customers.get(1139).getCity());
	}

	@Test
	@DisplayName("Record 1140: County is Bergen")
	void CountyOfRecord1140() {
		assertEquals("Bergen", customers.get(1139).getCounty());
	}

	@Test
	@DisplayName("Record 1140: State is NJ")
	void StateOfRecord1140() {
		assertEquals("NJ", customers.get(1139).getState());
	}

	@Test
	@DisplayName("Record 1140: ZIP is 7601")
	void ZIPOfRecord1140() {
		assertEquals("7601", customers.get(1139).getZIP());
	}

	@Test
	@DisplayName("Record 1140: Phone is 201-343-3543")
	void PhoneOfRecord1140() {
		assertEquals("201-343-3543", customers.get(1139).getPhone());
	}

	@Test
	@DisplayName("Record 1140: Fax is 201-343-8145")
	void FaxOfRecord1140() {
		assertEquals("201-343-8145", customers.get(1139).getFax());
	}

	@Test
	@DisplayName("Record 1140: Email is consuelo@provow.com")
	void EmailOfRecord1140() {
		assertEquals("consuelo@provow.com", customers.get(1139).getEmail());
	}

	@Test
	@DisplayName("Record 1140: Web is http://www.consueloprovow.com")
	void WebOfRecord1140() {
		assertEquals("http://www.consueloprovow.com", customers.get(1139).getWeb());
	}
}
