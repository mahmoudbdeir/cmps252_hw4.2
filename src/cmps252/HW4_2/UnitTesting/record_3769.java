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

@Tag("16")
class Record_3769 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3769: FirstName is Duncan")
	void FirstNameOfRecord3769() {
		assertEquals("Duncan", customers.get(3768).getFirstName());
	}

	@Test
	@DisplayName("Record 3769: LastName is Mozier")
	void LastNameOfRecord3769() {
		assertEquals("Mozier", customers.get(3768).getLastName());
	}

	@Test
	@DisplayName("Record 3769: Company is Korea Times & Han Kook Il Bo")
	void CompanyOfRecord3769() {
		assertEquals("Korea Times & Han Kook Il Bo", customers.get(3768).getCompany());
	}

	@Test
	@DisplayName("Record 3769: Address is 11901 Dorsett Rd")
	void AddressOfRecord3769() {
		assertEquals("11901 Dorsett Rd", customers.get(3768).getAddress());
	}

	@Test
	@DisplayName("Record 3769: City is Maryland Hyghts")
	void CityOfRecord3769() {
		assertEquals("Maryland Hyghts", customers.get(3768).getCity());
	}

	@Test
	@DisplayName("Record 3769: County is Saint Louis")
	void CountyOfRecord3769() {
		assertEquals("Saint Louis", customers.get(3768).getCounty());
	}

	@Test
	@DisplayName("Record 3769: State is MO")
	void StateOfRecord3769() {
		assertEquals("MO", customers.get(3768).getState());
	}

	@Test
	@DisplayName("Record 3769: ZIP is 63043")
	void ZIPOfRecord3769() {
		assertEquals("63043", customers.get(3768).getZIP());
	}

	@Test
	@DisplayName("Record 3769: Phone is 314-739-6865")
	void PhoneOfRecord3769() {
		assertEquals("314-739-6865", customers.get(3768).getPhone());
	}

	@Test
	@DisplayName("Record 3769: Fax is 314-739-9749")
	void FaxOfRecord3769() {
		assertEquals("314-739-9749", customers.get(3768).getFax());
	}

	@Test
	@DisplayName("Record 3769: Email is duncan@mozier.com")
	void EmailOfRecord3769() {
		assertEquals("duncan@mozier.com", customers.get(3768).getEmail());
	}

	@Test
	@DisplayName("Record 3769: Web is http://www.duncanmozier.com")
	void WebOfRecord3769() {
		assertEquals("http://www.duncanmozier.com", customers.get(3768).getWeb());
	}
}
