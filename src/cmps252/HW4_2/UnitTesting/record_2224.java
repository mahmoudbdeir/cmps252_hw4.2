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
class Record_2224 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2224: FirstName is Silas")
	void FirstNameOfRecord2224() {
		assertEquals("Silas", customers.get(2223).getFirstName());
	}

	@Test
	@DisplayName("Record 2224: LastName is Mondt")
	void LastNameOfRecord2224() {
		assertEquals("Mondt", customers.get(2223).getLastName());
	}

	@Test
	@DisplayName("Record 2224: Company is Perlman, Julian S Esq")
	void CompanyOfRecord2224() {
		assertEquals("Perlman, Julian S Esq", customers.get(2223).getCompany());
	}

	@Test
	@DisplayName("Record 2224: Address is 20 S Concourse")
	void AddressOfRecord2224() {
		assertEquals("20 S Concourse", customers.get(2223).getAddress());
	}

	@Test
	@DisplayName("Record 2224: City is Neptune")
	void CityOfRecord2224() {
		assertEquals("Neptune", customers.get(2223).getCity());
	}

	@Test
	@DisplayName("Record 2224: County is Monmouth")
	void CountyOfRecord2224() {
		assertEquals("Monmouth", customers.get(2223).getCounty());
	}

	@Test
	@DisplayName("Record 2224: State is NJ")
	void StateOfRecord2224() {
		assertEquals("NJ", customers.get(2223).getState());
	}

	@Test
	@DisplayName("Record 2224: ZIP is 7753")
	void ZIPOfRecord2224() {
		assertEquals("7753", customers.get(2223).getZIP());
	}

	@Test
	@DisplayName("Record 2224: Phone is 732-774-6124")
	void PhoneOfRecord2224() {
		assertEquals("732-774-6124", customers.get(2223).getPhone());
	}

	@Test
	@DisplayName("Record 2224: Fax is 732-774-3901")
	void FaxOfRecord2224() {
		assertEquals("732-774-3901", customers.get(2223).getFax());
	}

	@Test
	@DisplayName("Record 2224: Email is silas@mondt.com")
	void EmailOfRecord2224() {
		assertEquals("silas@mondt.com", customers.get(2223).getEmail());
	}

	@Test
	@DisplayName("Record 2224: Web is http://www.silasmondt.com")
	void WebOfRecord2224() {
		assertEquals("http://www.silasmondt.com", customers.get(2223).getWeb());
	}
}
