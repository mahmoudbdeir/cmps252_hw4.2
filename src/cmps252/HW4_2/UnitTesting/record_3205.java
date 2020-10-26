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

@Tag("39")
class Record_3205 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3205: FirstName is Thaddeus")
	void FirstNameOfRecord3205() {
		assertEquals("Thaddeus", customers.get(3204).getFirstName());
	}

	@Test
	@DisplayName("Record 3205: LastName is Prye")
	void LastNameOfRecord3205() {
		assertEquals("Prye", customers.get(3204).getLastName());
	}

	@Test
	@DisplayName("Record 3205: Company is Swinson, Curtis R Esq")
	void CompanyOfRecord3205() {
		assertEquals("Swinson, Curtis R Esq", customers.get(3204).getCompany());
	}

	@Test
	@DisplayName("Record 3205: Address is 408 N Broadway Ave")
	void AddressOfRecord3205() {
		assertEquals("408 N Broadway Ave", customers.get(3204).getAddress());
	}

	@Test
	@DisplayName("Record 3205: City is Tyler")
	void CityOfRecord3205() {
		assertEquals("Tyler", customers.get(3204).getCity());
	}

	@Test
	@DisplayName("Record 3205: County is Smith")
	void CountyOfRecord3205() {
		assertEquals("Smith", customers.get(3204).getCounty());
	}

	@Test
	@DisplayName("Record 3205: State is TX")
	void StateOfRecord3205() {
		assertEquals("TX", customers.get(3204).getState());
	}

	@Test
	@DisplayName("Record 3205: ZIP is 75702")
	void ZIPOfRecord3205() {
		assertEquals("75702", customers.get(3204).getZIP());
	}

	@Test
	@DisplayName("Record 3205: Phone is 903-597-8925")
	void PhoneOfRecord3205() {
		assertEquals("903-597-8925", customers.get(3204).getPhone());
	}

	@Test
	@DisplayName("Record 3205: Fax is 903-597-4294")
	void FaxOfRecord3205() {
		assertEquals("903-597-4294", customers.get(3204).getFax());
	}

	@Test
	@DisplayName("Record 3205: Email is thaddeus@prye.com")
	void EmailOfRecord3205() {
		assertEquals("thaddeus@prye.com", customers.get(3204).getEmail());
	}

	@Test
	@DisplayName("Record 3205: Web is http://www.thaddeusprye.com")
	void WebOfRecord3205() {
		assertEquals("http://www.thaddeusprye.com", customers.get(3204).getWeb());
	}
}
