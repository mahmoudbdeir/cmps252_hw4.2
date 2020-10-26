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

@Tag("9")
class Record_2637 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2637: FirstName is Wally")
	void FirstNameOfRecord2637() {
		assertEquals("Wally", customers.get(2636).getFirstName());
	}

	@Test
	@DisplayName("Record 2637: LastName is Kastens")
	void LastNameOfRecord2637() {
		assertEquals("Kastens", customers.get(2636).getLastName());
	}

	@Test
	@DisplayName("Record 2637: Company is Winegar, Todd S Esq")
	void CompanyOfRecord2637() {
		assertEquals("Winegar, Todd S Esq", customers.get(2636).getCompany());
	}

	@Test
	@DisplayName("Record 2637: Address is 511 Lexington Ave")
	void AddressOfRecord2637() {
		assertEquals("511 Lexington Ave", customers.get(2636).getAddress());
	}

	@Test
	@DisplayName("Record 2637: City is New York")
	void CityOfRecord2637() {
		assertEquals("New York", customers.get(2636).getCity());
	}

	@Test
	@DisplayName("Record 2637: County is New York")
	void CountyOfRecord2637() {
		assertEquals("New York", customers.get(2636).getCounty());
	}

	@Test
	@DisplayName("Record 2637: State is NY")
	void StateOfRecord2637() {
		assertEquals("NY", customers.get(2636).getState());
	}

	@Test
	@DisplayName("Record 2637: ZIP is 10017")
	void ZIPOfRecord2637() {
		assertEquals("10017", customers.get(2636).getZIP());
	}

	@Test
	@DisplayName("Record 2637: Phone is 212-421-2808")
	void PhoneOfRecord2637() {
		assertEquals("212-421-2808", customers.get(2636).getPhone());
	}

	@Test
	@DisplayName("Record 2637: Fax is 212-421-9612")
	void FaxOfRecord2637() {
		assertEquals("212-421-9612", customers.get(2636).getFax());
	}

	@Test
	@DisplayName("Record 2637: Email is wally@kastens.com")
	void EmailOfRecord2637() {
		assertEquals("wally@kastens.com", customers.get(2636).getEmail());
	}

	@Test
	@DisplayName("Record 2637: Web is http://www.wallykastens.com")
	void WebOfRecord2637() {
		assertEquals("http://www.wallykastens.com", customers.get(2636).getWeb());
	}
}
