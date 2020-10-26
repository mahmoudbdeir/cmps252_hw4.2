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

@Tag("18")
class Record_282 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 282: FirstName is Janel")
	void FirstNameOfRecord282() {
		assertEquals("Janel", customers.get(281).getFirstName());
	}

	@Test
	@DisplayName("Record 282: LastName is ydt")
	void LastNameOfRecord282() {
		assertEquals("ydt", customers.get(281).getLastName());
	}

	@Test
	@DisplayName("Record 282: Company is Johnston & Root Pc")
	void CompanyOfRecord282() {
		assertEquals("Johnston & Root Pc", customers.get(281).getCompany());
	}

	@Test
	@DisplayName("Record 282: Address is 49 W Malvern Ave")
	void AddressOfRecord282() {
		assertEquals("49 W Malvern Ave", customers.get(281).getAddress());
	}

	@Test
	@DisplayName("Record 282: City is Salt Lake City")
	void CityOfRecord282() {
		assertEquals("Salt Lake City", customers.get(281).getCity());
	}

	@Test
	@DisplayName("Record 282: County is Salt Lake")
	void CountyOfRecord282() {
		assertEquals("Salt Lake", customers.get(281).getCounty());
	}

	@Test
	@DisplayName("Record 282: State is UT")
	void StateOfRecord282() {
		assertEquals("UT", customers.get(281).getState());
	}

	@Test
	@DisplayName("Record 282: ZIP is 84115")
	void ZIPOfRecord282() {
		assertEquals("84115", customers.get(281).getZIP());
	}

	@Test
	@DisplayName("Record 282: Phone is 801-485-8042")
	void PhoneOfRecord282() {
		assertEquals("801-485-8042", customers.get(281).getPhone());
	}

	@Test
	@DisplayName("Record 282: Fax is 801-485-2483")
	void FaxOfRecord282() {
		assertEquals("801-485-2483", customers.get(281).getFax());
	}

	@Test
	@DisplayName("Record 282: Email is janel@ydt.com")
	void EmailOfRecord282() {
		assertEquals("janel@ydt.com", customers.get(281).getEmail());
	}

	@Test
	@DisplayName("Record 282: Web is http://www.janelydt.com")
	void WebOfRecord282() {
		assertEquals("http://www.janelydt.com", customers.get(281).getWeb());
	}
}
