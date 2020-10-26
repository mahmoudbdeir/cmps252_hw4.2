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
class Record_2888 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2888: FirstName is Manual")
	void FirstNameOfRecord2888() {
		assertEquals("Manual", customers.get(2887).getFirstName());
	}

	@Test
	@DisplayName("Record 2888: LastName is Dowson")
	void LastNameOfRecord2888() {
		assertEquals("Dowson", customers.get(2887).getLastName());
	}

	@Test
	@DisplayName("Record 2888: Company is Wellsprings Home Health Care")
	void CompanyOfRecord2888() {
		assertEquals("Wellsprings Home Health Care", customers.get(2887).getCompany());
	}

	@Test
	@DisplayName("Record 2888: Address is 12901 N Forty Driv")
	void AddressOfRecord2888() {
		assertEquals("12901 N Forty Driv", customers.get(2887).getAddress());
	}

	@Test
	@DisplayName("Record 2888: City is Saint Louis")
	void CityOfRecord2888() {
		assertEquals("Saint Louis", customers.get(2887).getCity());
	}

	@Test
	@DisplayName("Record 2888: County is Saint Louis")
	void CountyOfRecord2888() {
		assertEquals("Saint Louis", customers.get(2887).getCounty());
	}

	@Test
	@DisplayName("Record 2888: State is MO")
	void StateOfRecord2888() {
		assertEquals("MO", customers.get(2887).getState());
	}

	@Test
	@DisplayName("Record 2888: ZIP is 63141")
	void ZIPOfRecord2888() {
		assertEquals("63141", customers.get(2887).getZIP());
	}

	@Test
	@DisplayName("Record 2888: Phone is 314-523-6231")
	void PhoneOfRecord2888() {
		assertEquals("314-523-6231", customers.get(2887).getPhone());
	}

	@Test
	@DisplayName("Record 2888: Fax is 314-523-8987")
	void FaxOfRecord2888() {
		assertEquals("314-523-8987", customers.get(2887).getFax());
	}

	@Test
	@DisplayName("Record 2888: Email is manual@dowson.com")
	void EmailOfRecord2888() {
		assertEquals("manual@dowson.com", customers.get(2887).getEmail());
	}

	@Test
	@DisplayName("Record 2888: Web is http://www.manualdowson.com")
	void WebOfRecord2888() {
		assertEquals("http://www.manualdowson.com", customers.get(2887).getWeb());
	}
}
