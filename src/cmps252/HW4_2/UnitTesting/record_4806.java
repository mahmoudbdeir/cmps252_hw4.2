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

@Tag("8")
class Record_4806 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4806: FirstName is Dante")
	void FirstNameOfRecord4806() {
		assertEquals("Dante", customers.get(4805).getFirstName());
	}

	@Test
	@DisplayName("Record 4806: LastName is Gryf")
	void LastNameOfRecord4806() {
		assertEquals("Gryf", customers.get(4805).getLastName());
	}

	@Test
	@DisplayName("Record 4806: Company is Moore Colson & Company Pc")
	void CompanyOfRecord4806() {
		assertEquals("Moore Colson & Company Pc", customers.get(4805).getCompany());
	}

	@Test
	@DisplayName("Record 4806: Address is 30 Irving Pl")
	void AddressOfRecord4806() {
		assertEquals("30 Irving Pl", customers.get(4805).getAddress());
	}

	@Test
	@DisplayName("Record 4806: City is New York")
	void CityOfRecord4806() {
		assertEquals("New York", customers.get(4805).getCity());
	}

	@Test
	@DisplayName("Record 4806: County is New York")
	void CountyOfRecord4806() {
		assertEquals("New York", customers.get(4805).getCounty());
	}

	@Test
	@DisplayName("Record 4806: State is NY")
	void StateOfRecord4806() {
		assertEquals("NY", customers.get(4805).getState());
	}

	@Test
	@DisplayName("Record 4806: ZIP is 10003")
	void ZIPOfRecord4806() {
		assertEquals("10003", customers.get(4805).getZIP());
	}

	@Test
	@DisplayName("Record 4806: Phone is 212-475-7370")
	void PhoneOfRecord4806() {
		assertEquals("212-475-7370", customers.get(4805).getPhone());
	}

	@Test
	@DisplayName("Record 4806: Fax is 212-475-5916")
	void FaxOfRecord4806() {
		assertEquals("212-475-5916", customers.get(4805).getFax());
	}

	@Test
	@DisplayName("Record 4806: Email is dante@gryf.com")
	void EmailOfRecord4806() {
		assertEquals("dante@gryf.com", customers.get(4805).getEmail());
	}

	@Test
	@DisplayName("Record 4806: Web is http://www.dantegryf.com")
	void WebOfRecord4806() {
		assertEquals("http://www.dantegryf.com", customers.get(4805).getWeb());
	}
}
