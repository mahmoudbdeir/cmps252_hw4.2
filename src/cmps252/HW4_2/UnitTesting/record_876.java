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

@Tag("3")
class Record_876 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 876: FirstName is Eunice")
	void FirstNameOfRecord876() {
		assertEquals("Eunice", customers.get(875).getFirstName());
	}

	@Test
	@DisplayName("Record 876: LastName is Murrish")
	void LastNameOfRecord876() {
		assertEquals("Murrish", customers.get(875).getLastName());
	}

	@Test
	@DisplayName("Record 876: Company is Howard Johnson")
	void CompanyOfRecord876() {
		assertEquals("Howard Johnson", customers.get(875).getCompany());
	}

	@Test
	@DisplayName("Record 876: Address is 4027 Colonel Glenn Hwy  #-407")
	void AddressOfRecord876() {
		assertEquals("4027 Colonel Glenn Hwy  #-407", customers.get(875).getAddress());
	}

	@Test
	@DisplayName("Record 876: City is Dayton")
	void CityOfRecord876() {
		assertEquals("Dayton", customers.get(875).getCity());
	}

	@Test
	@DisplayName("Record 876: County is Greene")
	void CountyOfRecord876() {
		assertEquals("Greene", customers.get(875).getCounty());
	}

	@Test
	@DisplayName("Record 876: State is OH")
	void StateOfRecord876() {
		assertEquals("OH", customers.get(875).getState());
	}

	@Test
	@DisplayName("Record 876: ZIP is 45431")
	void ZIPOfRecord876() {
		assertEquals("45431", customers.get(875).getZIP());
	}

	@Test
	@DisplayName("Record 876: Phone is 937-429-4722")
	void PhoneOfRecord876() {
		assertEquals("937-429-4722", customers.get(875).getPhone());
	}

	@Test
	@DisplayName("Record 876: Fax is 937-429-0222")
	void FaxOfRecord876() {
		assertEquals("937-429-0222", customers.get(875).getFax());
	}

	@Test
	@DisplayName("Record 876: Email is eunice@murrish.com")
	void EmailOfRecord876() {
		assertEquals("eunice@murrish.com", customers.get(875).getEmail());
	}

	@Test
	@DisplayName("Record 876: Web is http://www.eunicemurrish.com")
	void WebOfRecord876() {
		assertEquals("http://www.eunicemurrish.com", customers.get(875).getWeb());
	}
}
