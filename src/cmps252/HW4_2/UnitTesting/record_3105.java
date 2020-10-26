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

@Tag("37")
class Record_3105 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3105: FirstName is Mathew")
	void FirstNameOfRecord3105() {
		assertEquals("Mathew", customers.get(3104).getFirstName());
	}

	@Test
	@DisplayName("Record 3105: LastName is Siliado")
	void LastNameOfRecord3105() {
		assertEquals("Siliado", customers.get(3104).getLastName());
	}

	@Test
	@DisplayName("Record 3105: Company is Joseph T Hardy & Son")
	void CompanyOfRecord3105() {
		assertEquals("Joseph T Hardy & Son", customers.get(3104).getCompany());
	}

	@Test
	@DisplayName("Record 3105: Address is 300 Se Riverside Dr")
	void AddressOfRecord3105() {
		assertEquals("300 Se Riverside Dr", customers.get(3104).getAddress());
	}

	@Test
	@DisplayName("Record 3105: City is Evansville")
	void CityOfRecord3105() {
		assertEquals("Evansville", customers.get(3104).getCity());
	}

	@Test
	@DisplayName("Record 3105: County is Vanderburgh")
	void CountyOfRecord3105() {
		assertEquals("Vanderburgh", customers.get(3104).getCounty());
	}

	@Test
	@DisplayName("Record 3105: State is IN")
	void StateOfRecord3105() {
		assertEquals("IN", customers.get(3104).getState());
	}

	@Test
	@DisplayName("Record 3105: ZIP is 47713")
	void ZIPOfRecord3105() {
		assertEquals("47713", customers.get(3104).getZIP());
	}

	@Test
	@DisplayName("Record 3105: Phone is 812-429-8608")
	void PhoneOfRecord3105() {
		assertEquals("812-429-8608", customers.get(3104).getPhone());
	}

	@Test
	@DisplayName("Record 3105: Fax is 812-429-1108")
	void FaxOfRecord3105() {
		assertEquals("812-429-1108", customers.get(3104).getFax());
	}

	@Test
	@DisplayName("Record 3105: Email is mathew@siliado.com")
	void EmailOfRecord3105() {
		assertEquals("mathew@siliado.com", customers.get(3104).getEmail());
	}

	@Test
	@DisplayName("Record 3105: Web is http://www.mathewsiliado.com")
	void WebOfRecord3105() {
		assertEquals("http://www.mathewsiliado.com", customers.get(3104).getWeb());
	}
}
