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

@Tag("7")
class Record_3672 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3672: FirstName is Dee")
	void FirstNameOfRecord3672() {
		assertEquals("Dee", customers.get(3671).getFirstName());
	}

	@Test
	@DisplayName("Record 3672: LastName is Ong")
	void LastNameOfRecord3672() {
		assertEquals("Ong", customers.get(3671).getLastName());
	}

	@Test
	@DisplayName("Record 3672: Company is Public Strategies")
	void CompanyOfRecord3672() {
		assertEquals("Public Strategies", customers.get(3671).getCompany());
	}

	@Test
	@DisplayName("Record 3672: Address is 11138 Airline Dr")
	void AddressOfRecord3672() {
		assertEquals("11138 Airline Dr", customers.get(3671).getAddress());
	}

	@Test
	@DisplayName("Record 3672: City is Houston")
	void CityOfRecord3672() {
		assertEquals("Houston", customers.get(3671).getCity());
	}

	@Test
	@DisplayName("Record 3672: County is Harris")
	void CountyOfRecord3672() {
		assertEquals("Harris", customers.get(3671).getCounty());
	}

	@Test
	@DisplayName("Record 3672: State is TX")
	void StateOfRecord3672() {
		assertEquals("TX", customers.get(3671).getState());
	}

	@Test
	@DisplayName("Record 3672: ZIP is 77037")
	void ZIPOfRecord3672() {
		assertEquals("77037", customers.get(3671).getZIP());
	}

	@Test
	@DisplayName("Record 3672: Phone is 713-448-0007")
	void PhoneOfRecord3672() {
		assertEquals("713-448-0007", customers.get(3671).getPhone());
	}

	@Test
	@DisplayName("Record 3672: Fax is 713-448-7267")
	void FaxOfRecord3672() {
		assertEquals("713-448-7267", customers.get(3671).getFax());
	}

	@Test
	@DisplayName("Record 3672: Email is dee@ong.com")
	void EmailOfRecord3672() {
		assertEquals("dee@ong.com", customers.get(3671).getEmail());
	}

	@Test
	@DisplayName("Record 3672: Web is http://www.deeong.com")
	void WebOfRecord3672() {
		assertEquals("http://www.deeong.com", customers.get(3671).getWeb());
	}
}
