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

@Tag("35")
class Record_972 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 972: FirstName is Debby")
	void FirstNameOfRecord972() {
		assertEquals("Debby", customers.get(971).getFirstName());
	}

	@Test
	@DisplayName("Record 972: LastName is Paalan")
	void LastNameOfRecord972() {
		assertEquals("Paalan", customers.get(971).getLastName());
	}

	@Test
	@DisplayName("Record 972: Company is Wmgp Radio Station")
	void CompanyOfRecord972() {
		assertEquals("Wmgp Radio Station", customers.get(971).getCompany());
	}

	@Test
	@DisplayName("Record 972: Address is 80 S Fair Oaks Ave")
	void AddressOfRecord972() {
		assertEquals("80 S Fair Oaks Ave", customers.get(971).getAddress());
	}

	@Test
	@DisplayName("Record 972: City is Pasadena")
	void CityOfRecord972() {
		assertEquals("Pasadena", customers.get(971).getCity());
	}

	@Test
	@DisplayName("Record 972: County is Los Angeles")
	void CountyOfRecord972() {
		assertEquals("Los Angeles", customers.get(971).getCounty());
	}

	@Test
	@DisplayName("Record 972: State is CA")
	void StateOfRecord972() {
		assertEquals("CA", customers.get(971).getState());
	}

	@Test
	@DisplayName("Record 972: ZIP is 91105")
	void ZIPOfRecord972() {
		assertEquals("91105", customers.get(971).getZIP());
	}

	@Test
	@DisplayName("Record 972: Phone is 626-796-3401")
	void PhoneOfRecord972() {
		assertEquals("626-796-3401", customers.get(971).getPhone());
	}

	@Test
	@DisplayName("Record 972: Fax is 626-796-6188")
	void FaxOfRecord972() {
		assertEquals("626-796-6188", customers.get(971).getFax());
	}

	@Test
	@DisplayName("Record 972: Email is debby@paalan.com")
	void EmailOfRecord972() {
		assertEquals("debby@paalan.com", customers.get(971).getEmail());
	}

	@Test
	@DisplayName("Record 972: Web is http://www.debbypaalan.com")
	void WebOfRecord972() {
		assertEquals("http://www.debbypaalan.com", customers.get(971).getWeb());
	}
}
