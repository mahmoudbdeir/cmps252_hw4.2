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

@Tag("10")
class Record_4489 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4489: FirstName is Jeffery")
	void FirstNameOfRecord4489() {
		assertEquals("Jeffery", customers.get(4488).getFirstName());
	}

	@Test
	@DisplayName("Record 4489: LastName is Causey")
	void LastNameOfRecord4489() {
		assertEquals("Causey", customers.get(4488).getLastName());
	}

	@Test
	@DisplayName("Record 4489: Company is William R Satterberg Jr Law")
	void CompanyOfRecord4489() {
		assertEquals("William R Satterberg Jr Law", customers.get(4488).getCompany());
	}

	@Test
	@DisplayName("Record 4489: Address is 4th")
	void AddressOfRecord4489() {
		assertEquals("4th", customers.get(4488).getAddress());
	}

	@Test
	@DisplayName("Record 4489: City is Valley Park")
	void CityOfRecord4489() {
		assertEquals("Valley Park", customers.get(4488).getCity());
	}

	@Test
	@DisplayName("Record 4489: County is Saint Louis")
	void CountyOfRecord4489() {
		assertEquals("Saint Louis", customers.get(4488).getCounty());
	}

	@Test
	@DisplayName("Record 4489: State is MO")
	void StateOfRecord4489() {
		assertEquals("MO", customers.get(4488).getState());
	}

	@Test
	@DisplayName("Record 4489: ZIP is 63088")
	void ZIPOfRecord4489() {
		assertEquals("63088", customers.get(4488).getZIP());
	}

	@Test
	@DisplayName("Record 4489: Phone is 314-225-9064")
	void PhoneOfRecord4489() {
		assertEquals("314-225-9064", customers.get(4488).getPhone());
	}

	@Test
	@DisplayName("Record 4489: Fax is 314-225-1008")
	void FaxOfRecord4489() {
		assertEquals("314-225-1008", customers.get(4488).getFax());
	}

	@Test
	@DisplayName("Record 4489: Email is jeffery@causey.com")
	void EmailOfRecord4489() {
		assertEquals("jeffery@causey.com", customers.get(4488).getEmail());
	}

	@Test
	@DisplayName("Record 4489: Web is http://www.jefferycausey.com")
	void WebOfRecord4489() {
		assertEquals("http://www.jefferycausey.com", customers.get(4488).getWeb());
	}
}
