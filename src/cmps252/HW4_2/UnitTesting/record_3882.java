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

@Tag("8")
class Record_3882 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3882: FirstName is Francine")
	void FirstNameOfRecord3882() {
		assertEquals("Francine", customers.get(3881).getFirstName());
	}

	@Test
	@DisplayName("Record 3882: LastName is Wootton")
	void LastNameOfRecord3882() {
		assertEquals("Wootton", customers.get(3881).getLastName());
	}

	@Test
	@DisplayName("Record 3882: Company is Tarver, Jack M Esq")
	void CompanyOfRecord3882() {
		assertEquals("Tarver, Jack M Esq", customers.get(3881).getCompany());
	}

	@Test
	@DisplayName("Record 3882: Address is 1050 Oak St Se  #-3")
	void AddressOfRecord3882() {
		assertEquals("1050 Oak St Se  #-3", customers.get(3881).getAddress());
	}

	@Test
	@DisplayName("Record 3882: City is Salem")
	void CityOfRecord3882() {
		assertEquals("Salem", customers.get(3881).getCity());
	}

	@Test
	@DisplayName("Record 3882: County is Marion")
	void CountyOfRecord3882() {
		assertEquals("Marion", customers.get(3881).getCounty());
	}

	@Test
	@DisplayName("Record 3882: State is OR")
	void StateOfRecord3882() {
		assertEquals("OR", customers.get(3881).getState());
	}

	@Test
	@DisplayName("Record 3882: ZIP is 97301")
	void ZIPOfRecord3882() {
		assertEquals("97301", customers.get(3881).getZIP());
	}

	@Test
	@DisplayName("Record 3882: Phone is 503-375-9681")
	void PhoneOfRecord3882() {
		assertEquals("503-375-9681", customers.get(3881).getPhone());
	}

	@Test
	@DisplayName("Record 3882: Fax is 503-375-8634")
	void FaxOfRecord3882() {
		assertEquals("503-375-8634", customers.get(3881).getFax());
	}

	@Test
	@DisplayName("Record 3882: Email is francine@wootton.com")
	void EmailOfRecord3882() {
		assertEquals("francine@wootton.com", customers.get(3881).getEmail());
	}

	@Test
	@DisplayName("Record 3882: Web is http://www.francinewootton.com")
	void WebOfRecord3882() {
		assertEquals("http://www.francinewootton.com", customers.get(3881).getWeb());
	}
}
