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

@Tag("12")
class Record_4167 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4167: FirstName is Kelley")
	void FirstNameOfRecord4167() {
		assertEquals("Kelley", customers.get(4166).getFirstName());
	}

	@Test
	@DisplayName("Record 4167: LastName is Lyerla")
	void LastNameOfRecord4167() {
		assertEquals("Lyerla", customers.get(4166).getLastName());
	}

	@Test
	@DisplayName("Record 4167: Company is American Health Care Apparel")
	void CompanyOfRecord4167() {
		assertEquals("American Health Care Apparel", customers.get(4166).getCompany());
	}

	@Test
	@DisplayName("Record 4167: Address is 5951 N Elston Ave")
	void AddressOfRecord4167() {
		assertEquals("5951 N Elston Ave", customers.get(4166).getAddress());
	}

	@Test
	@DisplayName("Record 4167: City is Chicago")
	void CityOfRecord4167() {
		assertEquals("Chicago", customers.get(4166).getCity());
	}

	@Test
	@DisplayName("Record 4167: County is Cook")
	void CountyOfRecord4167() {
		assertEquals("Cook", customers.get(4166).getCounty());
	}

	@Test
	@DisplayName("Record 4167: State is IL")
	void StateOfRecord4167() {
		assertEquals("IL", customers.get(4166).getState());
	}

	@Test
	@DisplayName("Record 4167: ZIP is 60646")
	void ZIPOfRecord4167() {
		assertEquals("60646", customers.get(4166).getZIP());
	}

	@Test
	@DisplayName("Record 4167: Phone is 773-763-8861")
	void PhoneOfRecord4167() {
		assertEquals("773-763-8861", customers.get(4166).getPhone());
	}

	@Test
	@DisplayName("Record 4167: Fax is 773-763-7394")
	void FaxOfRecord4167() {
		assertEquals("773-763-7394", customers.get(4166).getFax());
	}

	@Test
	@DisplayName("Record 4167: Email is kelley@lyerla.com")
	void EmailOfRecord4167() {
		assertEquals("kelley@lyerla.com", customers.get(4166).getEmail());
	}

	@Test
	@DisplayName("Record 4167: Web is http://www.kelleylyerla.com")
	void WebOfRecord4167() {
		assertEquals("http://www.kelleylyerla.com", customers.get(4166).getWeb());
	}
}
