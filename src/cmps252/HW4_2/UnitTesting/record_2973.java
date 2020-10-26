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
class Record_2973 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2973: FirstName is Sue")
	void FirstNameOfRecord2973() {
		assertEquals("Sue", customers.get(2972).getFirstName());
	}

	@Test
	@DisplayName("Record 2973: LastName is Arnaldo")
	void LastNameOfRecord2973() {
		assertEquals("Arnaldo", customers.get(2972).getLastName());
	}

	@Test
	@DisplayName("Record 2973: Company is John H Harland Co")
	void CompanyOfRecord2973() {
		assertEquals("John H Harland Co", customers.get(2972).getCompany());
	}

	@Test
	@DisplayName("Record 2973: Address is 1440 New York Ave Nw")
	void AddressOfRecord2973() {
		assertEquals("1440 New York Ave Nw", customers.get(2972).getAddress());
	}

	@Test
	@DisplayName("Record 2973: City is Washington")
	void CityOfRecord2973() {
		assertEquals("Washington", customers.get(2972).getCity());
	}

	@Test
	@DisplayName("Record 2973: County is District of Columbia")
	void CountyOfRecord2973() {
		assertEquals("District of Columbia", customers.get(2972).getCounty());
	}

	@Test
	@DisplayName("Record 2973: State is DC")
	void StateOfRecord2973() {
		assertEquals("DC", customers.get(2972).getState());
	}

	@Test
	@DisplayName("Record 2973: ZIP is 20005")
	void ZIPOfRecord2973() {
		assertEquals("20005", customers.get(2972).getZIP());
	}

	@Test
	@DisplayName("Record 2973: Phone is 202-638-5251")
	void PhoneOfRecord2973() {
		assertEquals("202-638-5251", customers.get(2972).getPhone());
	}

	@Test
	@DisplayName("Record 2973: Fax is 202-638-5744")
	void FaxOfRecord2973() {
		assertEquals("202-638-5744", customers.get(2972).getFax());
	}

	@Test
	@DisplayName("Record 2973: Email is sue@arnaldo.com")
	void EmailOfRecord2973() {
		assertEquals("sue@arnaldo.com", customers.get(2972).getEmail());
	}

	@Test
	@DisplayName("Record 2973: Web is http://www.suearnaldo.com")
	void WebOfRecord2973() {
		assertEquals("http://www.suearnaldo.com", customers.get(2972).getWeb());
	}
}
