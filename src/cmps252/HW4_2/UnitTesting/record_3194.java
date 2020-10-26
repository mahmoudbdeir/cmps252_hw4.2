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
class Record_3194 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3194: FirstName is Lonny")
	void FirstNameOfRecord3194() {
		assertEquals("Lonny", customers.get(3193).getFirstName());
	}

	@Test
	@DisplayName("Record 3194: LastName is Jefferis")
	void LastNameOfRecord3194() {
		assertEquals("Jefferis", customers.get(3193).getLastName());
	}

	@Test
	@DisplayName("Record 3194: Company is Alfa Pash Inc")
	void CompanyOfRecord3194() {
		assertEquals("Alfa Pash Inc", customers.get(3193).getCompany());
	}

	@Test
	@DisplayName("Record 3194: Address is 18761 Dd N")
	void AddressOfRecord3194() {
		assertEquals("18761 Dd N", customers.get(3193).getAddress());
	}

	@Test
	@DisplayName("Record 3194: City is Gaithersburg")
	void CityOfRecord3194() {
		assertEquals("Gaithersburg", customers.get(3193).getCity());
	}

	@Test
	@DisplayName("Record 3194: County is Montgomery")
	void CountyOfRecord3194() {
		assertEquals("Montgomery", customers.get(3193).getCounty());
	}

	@Test
	@DisplayName("Record 3194: State is MD")
	void StateOfRecord3194() {
		assertEquals("MD", customers.get(3193).getState());
	}

	@Test
	@DisplayName("Record 3194: ZIP is 20879")
	void ZIPOfRecord3194() {
		assertEquals("20879", customers.get(3193).getZIP());
	}

	@Test
	@DisplayName("Record 3194: Phone is 301-948-8767")
	void PhoneOfRecord3194() {
		assertEquals("301-948-8767", customers.get(3193).getPhone());
	}

	@Test
	@DisplayName("Record 3194: Fax is 301-948-6017")
	void FaxOfRecord3194() {
		assertEquals("301-948-6017", customers.get(3193).getFax());
	}

	@Test
	@DisplayName("Record 3194: Email is lonny@jefferis.com")
	void EmailOfRecord3194() {
		assertEquals("lonny@jefferis.com", customers.get(3193).getEmail());
	}

	@Test
	@DisplayName("Record 3194: Web is http://www.lonnyjefferis.com")
	void WebOfRecord3194() {
		assertEquals("http://www.lonnyjefferis.com", customers.get(3193).getWeb());
	}
}
