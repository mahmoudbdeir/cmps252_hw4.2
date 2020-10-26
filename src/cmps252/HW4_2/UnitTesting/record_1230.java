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

@Tag("22")
class Record_1230 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1230: FirstName is Lakysha")
	void FirstNameOfRecord1230() {
		assertEquals("Lakysha", customers.get(1229).getFirstName());
	}

	@Test
	@DisplayName("Record 1230: LastName is Masse")
	void LastNameOfRecord1230() {
		assertEquals("Masse", customers.get(1229).getLastName());
	}

	@Test
	@DisplayName("Record 1230: Company is Holiday Inn Express")
	void CompanyOfRecord1230() {
		assertEquals("Holiday Inn Express", customers.get(1229).getCompany());
	}

	@Test
	@DisplayName("Record 1230: Address is 580 Sylvan Ave")
	void AddressOfRecord1230() {
		assertEquals("580 Sylvan Ave", customers.get(1229).getAddress());
	}

	@Test
	@DisplayName("Record 1230: City is Englewood Cliffs")
	void CityOfRecord1230() {
		assertEquals("Englewood Cliffs", customers.get(1229).getCity());
	}

	@Test
	@DisplayName("Record 1230: County is Bergen")
	void CountyOfRecord1230() {
		assertEquals("Bergen", customers.get(1229).getCounty());
	}

	@Test
	@DisplayName("Record 1230: State is NJ")
	void StateOfRecord1230() {
		assertEquals("NJ", customers.get(1229).getState());
	}

	@Test
	@DisplayName("Record 1230: ZIP is 7632")
	void ZIPOfRecord1230() {
		assertEquals("7632", customers.get(1229).getZIP());
	}

	@Test
	@DisplayName("Record 1230: Phone is 201-568-7176")
	void PhoneOfRecord1230() {
		assertEquals("201-568-7176", customers.get(1229).getPhone());
	}

	@Test
	@DisplayName("Record 1230: Fax is 201-568-3437")
	void FaxOfRecord1230() {
		assertEquals("201-568-3437", customers.get(1229).getFax());
	}

	@Test
	@DisplayName("Record 1230: Email is lakysha@masse.com")
	void EmailOfRecord1230() {
		assertEquals("lakysha@masse.com", customers.get(1229).getEmail());
	}

	@Test
	@DisplayName("Record 1230: Web is http://www.lakyshamasse.com")
	void WebOfRecord1230() {
		assertEquals("http://www.lakyshamasse.com", customers.get(1229).getWeb());
	}
}
