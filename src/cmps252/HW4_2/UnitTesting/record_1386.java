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

@Tag("3")
class Record_1386 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1386: FirstName is Kyle")
	void FirstNameOfRecord1386() {
		assertEquals("Kyle", customers.get(1385).getFirstName());
	}

	@Test
	@DisplayName("Record 1386: LastName is Augustyn")
	void LastNameOfRecord1386() {
		assertEquals("Augustyn", customers.get(1385).getLastName());
	}

	@Test
	@DisplayName("Record 1386: Company is Velazquez, Joan B Esq")
	void CompanyOfRecord1386() {
		assertEquals("Velazquez, Joan B Esq", customers.get(1385).getCompany());
	}

	@Test
	@DisplayName("Record 1386: Address is 348 E Liberty St")
	void AddressOfRecord1386() {
		assertEquals("348 E Liberty St", customers.get(1385).getAddress());
	}

	@Test
	@DisplayName("Record 1386: City is Wooster")
	void CityOfRecord1386() {
		assertEquals("Wooster", customers.get(1385).getCity());
	}

	@Test
	@DisplayName("Record 1386: County is Wayne")
	void CountyOfRecord1386() {
		assertEquals("Wayne", customers.get(1385).getCounty());
	}

	@Test
	@DisplayName("Record 1386: State is OH")
	void StateOfRecord1386() {
		assertEquals("OH", customers.get(1385).getState());
	}

	@Test
	@DisplayName("Record 1386: ZIP is 44691")
	void ZIPOfRecord1386() {
		assertEquals("44691", customers.get(1385).getZIP());
	}

	@Test
	@DisplayName("Record 1386: Phone is 330-264-6639")
	void PhoneOfRecord1386() {
		assertEquals("330-264-6639", customers.get(1385).getPhone());
	}

	@Test
	@DisplayName("Record 1386: Fax is 330-264-6777")
	void FaxOfRecord1386() {
		assertEquals("330-264-6777", customers.get(1385).getFax());
	}

	@Test
	@DisplayName("Record 1386: Email is kyle@augustyn.com")
	void EmailOfRecord1386() {
		assertEquals("kyle@augustyn.com", customers.get(1385).getEmail());
	}

	@Test
	@DisplayName("Record 1386: Web is http://www.kyleaugustyn.com")
	void WebOfRecord1386() {
		assertEquals("http://www.kyleaugustyn.com", customers.get(1385).getWeb());
	}
}
