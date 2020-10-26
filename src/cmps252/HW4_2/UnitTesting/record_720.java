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
class Record_720 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 720: FirstName is Moses")
	void FirstNameOfRecord720() {
		assertEquals("Moses", customers.get(719).getFirstName());
	}

	@Test
	@DisplayName("Record 720: LastName is Tomjack")
	void LastNameOfRecord720() {
		assertEquals("Tomjack", customers.get(719).getLastName());
	}

	@Test
	@DisplayName("Record 720: Company is Goelz, Robert D Esq")
	void CompanyOfRecord720() {
		assertEquals("Goelz, Robert D Esq", customers.get(719).getCompany());
	}

	@Test
	@DisplayName("Record 720: Address is 20 S Bryel Blvd")
	void AddressOfRecord720() {
		assertEquals("20 S Bryel Blvd", customers.get(719).getAddress());
	}

	@Test
	@DisplayName("Record 720: City is Middletown")
	void CityOfRecord720() {
		assertEquals("Middletown", customers.get(719).getCity());
	}

	@Test
	@DisplayName("Record 720: County is Butler")
	void CountyOfRecord720() {
		assertEquals("Butler", customers.get(719).getCounty());
	}

	@Test
	@DisplayName("Record 720: State is OH")
	void StateOfRecord720() {
		assertEquals("OH", customers.get(719).getState());
	}

	@Test
	@DisplayName("Record 720: ZIP is 45044")
	void ZIPOfRecord720() {
		assertEquals("45044", customers.get(719).getZIP());
	}

	@Test
	@DisplayName("Record 720: Phone is 513-423-0853")
	void PhoneOfRecord720() {
		assertEquals("513-423-0853", customers.get(719).getPhone());
	}

	@Test
	@DisplayName("Record 720: Fax is 513-423-6046")
	void FaxOfRecord720() {
		assertEquals("513-423-6046", customers.get(719).getFax());
	}

	@Test
	@DisplayName("Record 720: Email is moses@tomjack.com")
	void EmailOfRecord720() {
		assertEquals("moses@tomjack.com", customers.get(719).getEmail());
	}

	@Test
	@DisplayName("Record 720: Web is http://www.mosestomjack.com")
	void WebOfRecord720() {
		assertEquals("http://www.mosestomjack.com", customers.get(719).getWeb());
	}
}
