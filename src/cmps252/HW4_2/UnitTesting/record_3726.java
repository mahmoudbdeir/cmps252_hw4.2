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
class Record_3726 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3726: FirstName is Douglass")
	void FirstNameOfRecord3726() {
		assertEquals("Douglass", customers.get(3725).getFirstName());
	}

	@Test
	@DisplayName("Record 3726: LastName is Bunzey")
	void LastNameOfRecord3726() {
		assertEquals("Bunzey", customers.get(3725).getLastName());
	}

	@Test
	@DisplayName("Record 3726: Company is Stephen C Whicker Pc")
	void CompanyOfRecord3726() {
		assertEquals("Stephen C Whicker Pc", customers.get(3725).getCompany());
	}

	@Test
	@DisplayName("Record 3726: Address is 2695 Mill St")
	void AddressOfRecord3726() {
		assertEquals("2695 Mill St", customers.get(3725).getAddress());
	}

	@Test
	@DisplayName("Record 3726: City is Reno")
	void CityOfRecord3726() {
		assertEquals("Reno", customers.get(3725).getCity());
	}

	@Test
	@DisplayName("Record 3726: County is Washoe")
	void CountyOfRecord3726() {
		assertEquals("Washoe", customers.get(3725).getCounty());
	}

	@Test
	@DisplayName("Record 3726: State is NV")
	void StateOfRecord3726() {
		assertEquals("NV", customers.get(3725).getState());
	}

	@Test
	@DisplayName("Record 3726: ZIP is 89502")
	void ZIPOfRecord3726() {
		assertEquals("89502", customers.get(3725).getZIP());
	}

	@Test
	@DisplayName("Record 3726: Phone is 775-324-9865")
	void PhoneOfRecord3726() {
		assertEquals("775-324-9865", customers.get(3725).getPhone());
	}

	@Test
	@DisplayName("Record 3726: Fax is 775-324-9839")
	void FaxOfRecord3726() {
		assertEquals("775-324-9839", customers.get(3725).getFax());
	}

	@Test
	@DisplayName("Record 3726: Email is douglass@bunzey.com")
	void EmailOfRecord3726() {
		assertEquals("douglass@bunzey.com", customers.get(3725).getEmail());
	}

	@Test
	@DisplayName("Record 3726: Web is http://www.douglassbunzey.com")
	void WebOfRecord3726() {
		assertEquals("http://www.douglassbunzey.com", customers.get(3725).getWeb());
	}
}
