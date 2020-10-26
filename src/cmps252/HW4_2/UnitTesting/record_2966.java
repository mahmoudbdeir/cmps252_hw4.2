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

@Tag("1")
class Record_2966 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2966: FirstName is Josef")
	void FirstNameOfRecord2966() {
		assertEquals("Josef", customers.get(2965).getFirstName());
	}

	@Test
	@DisplayName("Record 2966: LastName is Vorwerk")
	void LastNameOfRecord2966() {
		assertEquals("Vorwerk", customers.get(2965).getLastName());
	}

	@Test
	@DisplayName("Record 2966: Company is Advance Fed Svngs & Ln Assn")
	void CompanyOfRecord2966() {
		assertEquals("Advance Fed Svngs & Ln Assn", customers.get(2965).getCompany());
	}

	@Test
	@DisplayName("Record 2966: Address is 3013 3rd Ave N")
	void AddressOfRecord2966() {
		assertEquals("3013 3rd Ave N", customers.get(2965).getAddress());
	}

	@Test
	@DisplayName("Record 2966: City is Seattle")
	void CityOfRecord2966() {
		assertEquals("Seattle", customers.get(2965).getCity());
	}

	@Test
	@DisplayName("Record 2966: County is King")
	void CountyOfRecord2966() {
		assertEquals("King", customers.get(2965).getCounty());
	}

	@Test
	@DisplayName("Record 2966: State is WA")
	void StateOfRecord2966() {
		assertEquals("WA", customers.get(2965).getState());
	}

	@Test
	@DisplayName("Record 2966: ZIP is 98109")
	void ZIPOfRecord2966() {
		assertEquals("98109", customers.get(2965).getZIP());
	}

	@Test
	@DisplayName("Record 2966: Phone is 206-284-0550")
	void PhoneOfRecord2966() {
		assertEquals("206-284-0550", customers.get(2965).getPhone());
	}

	@Test
	@DisplayName("Record 2966: Fax is 206-284-3429")
	void FaxOfRecord2966() {
		assertEquals("206-284-3429", customers.get(2965).getFax());
	}

	@Test
	@DisplayName("Record 2966: Email is josef@vorwerk.com")
	void EmailOfRecord2966() {
		assertEquals("josef@vorwerk.com", customers.get(2965).getEmail());
	}

	@Test
	@DisplayName("Record 2966: Web is http://www.josefvorwerk.com")
	void WebOfRecord2966() {
		assertEquals("http://www.josefvorwerk.com", customers.get(2965).getWeb());
	}
}
