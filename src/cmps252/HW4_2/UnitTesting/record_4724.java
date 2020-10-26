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

@Tag("14")
class Record_4724 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4724: FirstName is Monique")
	void FirstNameOfRecord4724() {
		assertEquals("Monique", customers.get(4723).getFirstName());
	}

	@Test
	@DisplayName("Record 4724: LastName is Hedemann")
	void LastNameOfRecord4724() {
		assertEquals("Hedemann", customers.get(4723).getLastName());
	}

	@Test
	@DisplayName("Record 4724: Company is Coast Wholesale Music Corp")
	void CompanyOfRecord4724() {
		assertEquals("Coast Wholesale Music Corp", customers.get(4723).getCompany());
	}

	@Test
	@DisplayName("Record 4724: Address is 3700 Liberty Ave")
	void AddressOfRecord4724() {
		assertEquals("3700 Liberty Ave", customers.get(4723).getAddress());
	}

	@Test
	@DisplayName("Record 4724: City is Pittsburgh")
	void CityOfRecord4724() {
		assertEquals("Pittsburgh", customers.get(4723).getCity());
	}

	@Test
	@DisplayName("Record 4724: County is Allegheny")
	void CountyOfRecord4724() {
		assertEquals("Allegheny", customers.get(4723).getCounty());
	}

	@Test
	@DisplayName("Record 4724: State is PA")
	void StateOfRecord4724() {
		assertEquals("PA", customers.get(4723).getState());
	}

	@Test
	@DisplayName("Record 4724: ZIP is 15201")
	void ZIPOfRecord4724() {
		assertEquals("15201", customers.get(4723).getZIP());
	}

	@Test
	@DisplayName("Record 4724: Phone is 412-687-6672")
	void PhoneOfRecord4724() {
		assertEquals("412-687-6672", customers.get(4723).getPhone());
	}

	@Test
	@DisplayName("Record 4724: Fax is 412-687-7316")
	void FaxOfRecord4724() {
		assertEquals("412-687-7316", customers.get(4723).getFax());
	}

	@Test
	@DisplayName("Record 4724: Email is monique@hedemann.com")
	void EmailOfRecord4724() {
		assertEquals("monique@hedemann.com", customers.get(4723).getEmail());
	}

	@Test
	@DisplayName("Record 4724: Web is http://www.moniquehedemann.com")
	void WebOfRecord4724() {
		assertEquals("http://www.moniquehedemann.com", customers.get(4723).getWeb());
	}
}
