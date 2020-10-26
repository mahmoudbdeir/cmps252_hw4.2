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

@Tag("19")
class Record_3981 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3981: FirstName is Marietta")
	void FirstNameOfRecord3981() {
		assertEquals("Marietta", customers.get(3980).getFirstName());
	}

	@Test
	@DisplayName("Record 3981: LastName is Solian")
	void LastNameOfRecord3981() {
		assertEquals("Solian", customers.get(3980).getLastName());
	}

	@Test
	@DisplayName("Record 3981: Company is Baker, Paul W Esq")
	void CompanyOfRecord3981() {
		assertEquals("Baker, Paul W Esq", customers.get(3980).getCompany());
	}

	@Test
	@DisplayName("Record 3981: Address is 202 S Michigan St")
	void AddressOfRecord3981() {
		assertEquals("202 S Michigan St", customers.get(3980).getAddress());
	}

	@Test
	@DisplayName("Record 3981: City is South Bend")
	void CityOfRecord3981() {
		assertEquals("South Bend", customers.get(3980).getCity());
	}

	@Test
	@DisplayName("Record 3981: County is St Joseph")
	void CountyOfRecord3981() {
		assertEquals("St Joseph", customers.get(3980).getCounty());
	}

	@Test
	@DisplayName("Record 3981: State is IN")
	void StateOfRecord3981() {
		assertEquals("IN", customers.get(3980).getState());
	}

	@Test
	@DisplayName("Record 3981: ZIP is 46601")
	void ZIPOfRecord3981() {
		assertEquals("46601", customers.get(3980).getZIP());
	}

	@Test
	@DisplayName("Record 3981: Phone is 574-234-7368")
	void PhoneOfRecord3981() {
		assertEquals("574-234-7368", customers.get(3980).getPhone());
	}

	@Test
	@DisplayName("Record 3981: Fax is 574-234-6433")
	void FaxOfRecord3981() {
		assertEquals("574-234-6433", customers.get(3980).getFax());
	}

	@Test
	@DisplayName("Record 3981: Email is marietta@solian.com")
	void EmailOfRecord3981() {
		assertEquals("marietta@solian.com", customers.get(3980).getEmail());
	}

	@Test
	@DisplayName("Record 3981: Web is http://www.mariettasolian.com")
	void WebOfRecord3981() {
		assertEquals("http://www.mariettasolian.com", customers.get(3980).getWeb());
	}
}
