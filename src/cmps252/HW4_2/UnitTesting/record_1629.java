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

@Tag("27")
class Record_1629 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1629: FirstName is Thad")
	void FirstNameOfRecord1629() {
		assertEquals("Thad", customers.get(1628).getFirstName());
	}

	@Test
	@DisplayName("Record 1629: LastName is Halima")
	void LastNameOfRecord1629() {
		assertEquals("Halima", customers.get(1628).getLastName());
	}

	@Test
	@DisplayName("Record 1629: Company is Florig Equipment Richmond Inc")
	void CompanyOfRecord1629() {
		assertEquals("Florig Equipment Richmond Inc", customers.get(1628).getCompany());
	}

	@Test
	@DisplayName("Record 1629: Address is 2924 Newtown Ave")
	void AddressOfRecord1629() {
		assertEquals("2924 Newtown Ave", customers.get(1628).getAddress());
	}

	@Test
	@DisplayName("Record 1629: City is Astoria")
	void CityOfRecord1629() {
		assertEquals("Astoria", customers.get(1628).getCity());
	}

	@Test
	@DisplayName("Record 1629: County is Queens")
	void CountyOfRecord1629() {
		assertEquals("Queens", customers.get(1628).getCounty());
	}

	@Test
	@DisplayName("Record 1629: State is NY")
	void StateOfRecord1629() {
		assertEquals("NY", customers.get(1628).getState());
	}

	@Test
	@DisplayName("Record 1629: ZIP is 11102")
	void ZIPOfRecord1629() {
		assertEquals("11102", customers.get(1628).getZIP());
	}

	@Test
	@DisplayName("Record 1629: Phone is 718-728-5577")
	void PhoneOfRecord1629() {
		assertEquals("718-728-5577", customers.get(1628).getPhone());
	}

	@Test
	@DisplayName("Record 1629: Fax is 718-728-0779")
	void FaxOfRecord1629() {
		assertEquals("718-728-0779", customers.get(1628).getFax());
	}

	@Test
	@DisplayName("Record 1629: Email is thad@halima.com")
	void EmailOfRecord1629() {
		assertEquals("thad@halima.com", customers.get(1628).getEmail());
	}

	@Test
	@DisplayName("Record 1629: Web is http://www.thadhalima.com")
	void WebOfRecord1629() {
		assertEquals("http://www.thadhalima.com", customers.get(1628).getWeb());
	}
}
