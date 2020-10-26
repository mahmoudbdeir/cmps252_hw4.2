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

@Tag("42")
class Record_502 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 502: FirstName is Robby")
	void FirstNameOfRecord502() {
		assertEquals("Robby", customers.get(501).getFirstName());
	}

	@Test
	@DisplayName("Record 502: LastName is Ardolino")
	void LastNameOfRecord502() {
		assertEquals("Ardolino", customers.get(501).getLastName());
	}

	@Test
	@DisplayName("Record 502: Company is yges, Patricia A Esq")
	void CompanyOfRecord502() {
		assertEquals("yges, Patricia A Esq", customers.get(501).getCompany());
	}

	@Test
	@DisplayName("Record 502: Address is 50 S Maple St")
	void AddressOfRecord502() {
		assertEquals("50 S Maple St", customers.get(501).getAddress());
	}

	@Test
	@DisplayName("Record 502: City is Akron")
	void CityOfRecord502() {
		assertEquals("Akron", customers.get(501).getCity());
	}

	@Test
	@DisplayName("Record 502: County is Summit")
	void CountyOfRecord502() {
		assertEquals("Summit", customers.get(501).getCounty());
	}

	@Test
	@DisplayName("Record 502: State is OH")
	void StateOfRecord502() {
		assertEquals("OH", customers.get(501).getState());
	}

	@Test
	@DisplayName("Record 502: ZIP is 44303")
	void ZIPOfRecord502() {
		assertEquals("44303", customers.get(501).getZIP());
	}

	@Test
	@DisplayName("Record 502: Phone is 330-376-1048")
	void PhoneOfRecord502() {
		assertEquals("330-376-1048", customers.get(501).getPhone());
	}

	@Test
	@DisplayName("Record 502: Fax is 330-376-0271")
	void FaxOfRecord502() {
		assertEquals("330-376-0271", customers.get(501).getFax());
	}

	@Test
	@DisplayName("Record 502: Email is robby@ardolino.com")
	void EmailOfRecord502() {
		assertEquals("robby@ardolino.com", customers.get(501).getEmail());
	}

	@Test
	@DisplayName("Record 502: Web is http://www.robbyardolino.com")
	void WebOfRecord502() {
		assertEquals("http://www.robbyardolino.com", customers.get(501).getWeb());
	}
}
