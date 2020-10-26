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

@Tag("16")
class Record_2667 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2667: FirstName is Annmarie")
	void FirstNameOfRecord2667() {
		assertEquals("Annmarie", customers.get(2666).getFirstName());
	}

	@Test
	@DisplayName("Record 2667: LastName is Woodson")
	void LastNameOfRecord2667() {
		assertEquals("Woodson", customers.get(2666).getLastName());
	}

	@Test
	@DisplayName("Record 2667: Company is Lucas Studios")
	void CompanyOfRecord2667() {
		assertEquals("Lucas Studios", customers.get(2666).getCompany());
	}

	@Test
	@DisplayName("Record 2667: Address is 1463 White Ln")
	void AddressOfRecord2667() {
		assertEquals("1463 White Ln", customers.get(2666).getAddress());
	}

	@Test
	@DisplayName("Record 2667: City is Bakersfield")
	void CityOfRecord2667() {
		assertEquals("Bakersfield", customers.get(2666).getCity());
	}

	@Test
	@DisplayName("Record 2667: County is Kern")
	void CountyOfRecord2667() {
		assertEquals("Kern", customers.get(2666).getCounty());
	}

	@Test
	@DisplayName("Record 2667: State is CA")
	void StateOfRecord2667() {
		assertEquals("CA", customers.get(2666).getState());
	}

	@Test
	@DisplayName("Record 2667: ZIP is 93307")
	void ZIPOfRecord2667() {
		assertEquals("93307", customers.get(2666).getZIP());
	}

	@Test
	@DisplayName("Record 2667: Phone is 661-834-2975")
	void PhoneOfRecord2667() {
		assertEquals("661-834-2975", customers.get(2666).getPhone());
	}

	@Test
	@DisplayName("Record 2667: Fax is 661-834-1097")
	void FaxOfRecord2667() {
		assertEquals("661-834-1097", customers.get(2666).getFax());
	}

	@Test
	@DisplayName("Record 2667: Email is annmarie@woodson.com")
	void EmailOfRecord2667() {
		assertEquals("annmarie@woodson.com", customers.get(2666).getEmail());
	}

	@Test
	@DisplayName("Record 2667: Web is http://www.annmariewoodson.com")
	void WebOfRecord2667() {
		assertEquals("http://www.annmariewoodson.com", customers.get(2666).getWeb());
	}
}
