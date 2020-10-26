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

@Tag("25")
class Record_3175 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3175: FirstName is Zachery")
	void FirstNameOfRecord3175() {
		assertEquals("Zachery", customers.get(3174).getFirstName());
	}

	@Test
	@DisplayName("Record 3175: LastName is Escatel")
	void LastNameOfRecord3175() {
		assertEquals("Escatel", customers.get(3174).getLastName());
	}

	@Test
	@DisplayName("Record 3175: Company is Hunt, Mary M Esq")
	void CompanyOfRecord3175() {
		assertEquals("Hunt, Mary M Esq", customers.get(3174).getCompany());
	}

	@Test
	@DisplayName("Record 3175: Address is 401 2nd Ave S")
	void AddressOfRecord3175() {
		assertEquals("401 2nd Ave S", customers.get(3174).getAddress());
	}

	@Test
	@DisplayName("Record 3175: City is Seattle")
	void CityOfRecord3175() {
		assertEquals("Seattle", customers.get(3174).getCity());
	}

	@Test
	@DisplayName("Record 3175: County is King")
	void CountyOfRecord3175() {
		assertEquals("King", customers.get(3174).getCounty());
	}

	@Test
	@DisplayName("Record 3175: State is WA")
	void StateOfRecord3175() {
		assertEquals("WA", customers.get(3174).getState());
	}

	@Test
	@DisplayName("Record 3175: ZIP is 98104")
	void ZIPOfRecord3175() {
		assertEquals("98104", customers.get(3174).getZIP());
	}

	@Test
	@DisplayName("Record 3175: Phone is 206-292-6789")
	void PhoneOfRecord3175() {
		assertEquals("206-292-6789", customers.get(3174).getPhone());
	}

	@Test
	@DisplayName("Record 3175: Fax is 206-292-6233")
	void FaxOfRecord3175() {
		assertEquals("206-292-6233", customers.get(3174).getFax());
	}

	@Test
	@DisplayName("Record 3175: Email is zachery@escatel.com")
	void EmailOfRecord3175() {
		assertEquals("zachery@escatel.com", customers.get(3174).getEmail());
	}

	@Test
	@DisplayName("Record 3175: Web is http://www.zacheryescatel.com")
	void WebOfRecord3175() {
		assertEquals("http://www.zacheryescatel.com", customers.get(3174).getWeb());
	}
}
