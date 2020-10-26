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

@Tag("13")
class Record_3371 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3371: FirstName is Josh")
	void FirstNameOfRecord3371() {
		assertEquals("Josh", customers.get(3370).getFirstName());
	}

	@Test
	@DisplayName("Record 3371: LastName is Loarca")
	void LastNameOfRecord3371() {
		assertEquals("Loarca", customers.get(3370).getLastName());
	}

	@Test
	@DisplayName("Record 3371: Company is Krawits, Arthur M Esq")
	void CompanyOfRecord3371() {
		assertEquals("Krawits, Arthur M Esq", customers.get(3370).getCompany());
	}

	@Test
	@DisplayName("Record 3371: Address is 38 N Forklanding Rd")
	void AddressOfRecord3371() {
		assertEquals("38 N Forklanding Rd", customers.get(3370).getAddress());
	}

	@Test
	@DisplayName("Record 3371: City is Maple Shade")
	void CityOfRecord3371() {
		assertEquals("Maple Shade", customers.get(3370).getCity());
	}

	@Test
	@DisplayName("Record 3371: County is Burlington")
	void CountyOfRecord3371() {
		assertEquals("Burlington", customers.get(3370).getCounty());
	}

	@Test
	@DisplayName("Record 3371: State is NJ")
	void StateOfRecord3371() {
		assertEquals("NJ", customers.get(3370).getState());
	}

	@Test
	@DisplayName("Record 3371: ZIP is 8052")
	void ZIPOfRecord3371() {
		assertEquals("8052", customers.get(3370).getZIP());
	}

	@Test
	@DisplayName("Record 3371: Phone is 856-482-2877")
	void PhoneOfRecord3371() {
		assertEquals("856-482-2877", customers.get(3370).getPhone());
	}

	@Test
	@DisplayName("Record 3371: Fax is 856-482-1404")
	void FaxOfRecord3371() {
		assertEquals("856-482-1404", customers.get(3370).getFax());
	}

	@Test
	@DisplayName("Record 3371: Email is josh@loarca.com")
	void EmailOfRecord3371() {
		assertEquals("josh@loarca.com", customers.get(3370).getEmail());
	}

	@Test
	@DisplayName("Record 3371: Web is http://www.joshloarca.com")
	void WebOfRecord3371() {
		assertEquals("http://www.joshloarca.com", customers.get(3370).getWeb());
	}
}
