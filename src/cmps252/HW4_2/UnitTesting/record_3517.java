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

@Tag("36")
class Record_3517 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3517: FirstName is Mitchel")
	void FirstNameOfRecord3517() {
		assertEquals("Mitchel", customers.get(3516).getFirstName());
	}

	@Test
	@DisplayName("Record 3517: LastName is Aveni")
	void LastNameOfRecord3517() {
		assertEquals("Aveni", customers.get(3516).getLastName());
	}

	@Test
	@DisplayName("Record 3517: Company is Pyramid Chemical Sales")
	void CompanyOfRecord3517() {
		assertEquals("Pyramid Chemical Sales", customers.get(3516).getCompany());
	}

	@Test
	@DisplayName("Record 3517: Address is 1 Hoffman St")
	void AddressOfRecord3517() {
		assertEquals("1 Hoffman St", customers.get(3516).getAddress());
	}

	@Test
	@DisplayName("Record 3517: City is Spring Valley")
	void CityOfRecord3517() {
		assertEquals("Spring Valley", customers.get(3516).getCity());
	}

	@Test
	@DisplayName("Record 3517: County is Rockland")
	void CountyOfRecord3517() {
		assertEquals("Rockland", customers.get(3516).getCounty());
	}

	@Test
	@DisplayName("Record 3517: State is NY")
	void StateOfRecord3517() {
		assertEquals("NY", customers.get(3516).getState());
	}

	@Test
	@DisplayName("Record 3517: ZIP is 10977")
	void ZIPOfRecord3517() {
		assertEquals("10977", customers.get(3516).getZIP());
	}

	@Test
	@DisplayName("Record 3517: Phone is 845-356-7587")
	void PhoneOfRecord3517() {
		assertEquals("845-356-7587", customers.get(3516).getPhone());
	}

	@Test
	@DisplayName("Record 3517: Fax is 845-356-7968")
	void FaxOfRecord3517() {
		assertEquals("845-356-7968", customers.get(3516).getFax());
	}

	@Test
	@DisplayName("Record 3517: Email is mitchel@aveni.com")
	void EmailOfRecord3517() {
		assertEquals("mitchel@aveni.com", customers.get(3516).getEmail());
	}

	@Test
	@DisplayName("Record 3517: Web is http://www.mitchelaveni.com")
	void WebOfRecord3517() {
		assertEquals("http://www.mitchelaveni.com", customers.get(3516).getWeb());
	}
}
