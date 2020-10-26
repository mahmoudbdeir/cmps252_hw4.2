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

@Tag("43")
class Record_377 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 377: FirstName is Roosevelt")
	void FirstNameOfRecord377() {
		assertEquals("Roosevelt", customers.get(376).getFirstName());
	}

	@Test
	@DisplayName("Record 377: LastName is Arn")
	void LastNameOfRecord377() {
		assertEquals("Arn", customers.get(376).getLastName());
	}

	@Test
	@DisplayName("Record 377: Company is Bbc Pump And Equipment Co Inc")
	void CompanyOfRecord377() {
		assertEquals("Bbc Pump And Equipment Co Inc", customers.get(376).getCompany());
	}

	@Test
	@DisplayName("Record 377: Address is 610 E Romie Ln")
	void AddressOfRecord377() {
		assertEquals("610 E Romie Ln", customers.get(376).getAddress());
	}

	@Test
	@DisplayName("Record 377: City is Salinas")
	void CityOfRecord377() {
		assertEquals("Salinas", customers.get(376).getCity());
	}

	@Test
	@DisplayName("Record 377: County is Monterey")
	void CountyOfRecord377() {
		assertEquals("Monterey", customers.get(376).getCounty());
	}

	@Test
	@DisplayName("Record 377: State is CA")
	void StateOfRecord377() {
		assertEquals("CA", customers.get(376).getState());
	}

	@Test
	@DisplayName("Record 377: ZIP is 93901")
	void ZIPOfRecord377() {
		assertEquals("93901", customers.get(376).getZIP());
	}

	@Test
	@DisplayName("Record 377: Phone is 831-758-5235")
	void PhoneOfRecord377() {
		assertEquals("831-758-5235", customers.get(376).getPhone());
	}

	@Test
	@DisplayName("Record 377: Fax is 831-758-1933")
	void FaxOfRecord377() {
		assertEquals("831-758-1933", customers.get(376).getFax());
	}

	@Test
	@DisplayName("Record 377: Email is roosevelt@arn.com")
	void EmailOfRecord377() {
		assertEquals("roosevelt@arn.com", customers.get(376).getEmail());
	}

	@Test
	@DisplayName("Record 377: Web is http://www.rooseveltarn.com")
	void WebOfRecord377() {
		assertEquals("http://www.rooseveltarn.com", customers.get(376).getWeb());
	}
}
