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

@Tag("48")
class Record_1255 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1255: FirstName is Evelyn")
	void FirstNameOfRecord1255() {
		assertEquals("Evelyn", customers.get(1254).getFirstName());
	}

	@Test
	@DisplayName("Record 1255: LastName is Ehrhart")
	void LastNameOfRecord1255() {
		assertEquals("Ehrhart", customers.get(1254).getLastName());
	}

	@Test
	@DisplayName("Record 1255: Company is Nelson Lamar & Miller Pc")
	void CompanyOfRecord1255() {
		assertEquals("Nelson Lamar & Miller Pc", customers.get(1254).getCompany());
	}

	@Test
	@DisplayName("Record 1255: Address is 1339 N Main Ave")
	void AddressOfRecord1255() {
		assertEquals("1339 N Main Ave", customers.get(1254).getAddress());
	}

	@Test
	@DisplayName("Record 1255: City is Scranton")
	void CityOfRecord1255() {
		assertEquals("Scranton", customers.get(1254).getCity());
	}

	@Test
	@DisplayName("Record 1255: County is Lackawanna")
	void CountyOfRecord1255() {
		assertEquals("Lackawanna", customers.get(1254).getCounty());
	}

	@Test
	@DisplayName("Record 1255: State is PA")
	void StateOfRecord1255() {
		assertEquals("PA", customers.get(1254).getState());
	}

	@Test
	@DisplayName("Record 1255: ZIP is 18508")
	void ZIPOfRecord1255() {
		assertEquals("18508", customers.get(1254).getZIP());
	}

	@Test
	@DisplayName("Record 1255: Phone is 570-344-0570")
	void PhoneOfRecord1255() {
		assertEquals("570-344-0570", customers.get(1254).getPhone());
	}

	@Test
	@DisplayName("Record 1255: Fax is 570-344-2567")
	void FaxOfRecord1255() {
		assertEquals("570-344-2567", customers.get(1254).getFax());
	}

	@Test
	@DisplayName("Record 1255: Email is evelyn@ehrhart.com")
	void EmailOfRecord1255() {
		assertEquals("evelyn@ehrhart.com", customers.get(1254).getEmail());
	}

	@Test
	@DisplayName("Record 1255: Web is http://www.evelynehrhart.com")
	void WebOfRecord1255() {
		assertEquals("http://www.evelynehrhart.com", customers.get(1254).getWeb());
	}
}
