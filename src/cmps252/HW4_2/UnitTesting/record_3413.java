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

@Tag("28")
class Record_3413 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3413: FirstName is Lashonda")
	void FirstNameOfRecord3413() {
		assertEquals("Lashonda", customers.get(3412).getFirstName());
	}

	@Test
	@DisplayName("Record 3413: LastName is Gillham")
	void LastNameOfRecord3413() {
		assertEquals("Gillham", customers.get(3412).getLastName());
	}

	@Test
	@DisplayName("Record 3413: Company is Madison County Chamber Commrce")
	void CompanyOfRecord3413() {
		assertEquals("Madison County Chamber Commrce", customers.get(3412).getCompany());
	}

	@Test
	@DisplayName("Record 3413: Address is 183 Canal St")
	void AddressOfRecord3413() {
		assertEquals("183 Canal St", customers.get(3412).getAddress());
	}

	@Test
	@DisplayName("Record 3413: City is New York")
	void CityOfRecord3413() {
		assertEquals("New York", customers.get(3412).getCity());
	}

	@Test
	@DisplayName("Record 3413: County is New York")
	void CountyOfRecord3413() {
		assertEquals("New York", customers.get(3412).getCounty());
	}

	@Test
	@DisplayName("Record 3413: State is NY")
	void StateOfRecord3413() {
		assertEquals("NY", customers.get(3412).getState());
	}

	@Test
	@DisplayName("Record 3413: ZIP is 10013")
	void ZIPOfRecord3413() {
		assertEquals("10013", customers.get(3412).getZIP());
	}

	@Test
	@DisplayName("Record 3413: Phone is 212-285-1599")
	void PhoneOfRecord3413() {
		assertEquals("212-285-1599", customers.get(3412).getPhone());
	}

	@Test
	@DisplayName("Record 3413: Fax is 212-285-4765")
	void FaxOfRecord3413() {
		assertEquals("212-285-4765", customers.get(3412).getFax());
	}

	@Test
	@DisplayName("Record 3413: Email is lashonda@gillham.com")
	void EmailOfRecord3413() {
		assertEquals("lashonda@gillham.com", customers.get(3412).getEmail());
	}

	@Test
	@DisplayName("Record 3413: Web is http://www.lashondagillham.com")
	void WebOfRecord3413() {
		assertEquals("http://www.lashondagillham.com", customers.get(3412).getWeb());
	}
}
