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
class Record_587 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 587: FirstName is Emilia")
	void FirstNameOfRecord587() {
		assertEquals("Emilia", customers.get(586).getFirstName());
	}

	@Test
	@DisplayName("Record 587: LastName is Longin")
	void LastNameOfRecord587() {
		assertEquals("Longin", customers.get(586).getLastName());
	}

	@Test
	@DisplayName("Record 587: Company is La Quinta Inn")
	void CompanyOfRecord587() {
		assertEquals("La Quinta Inn", customers.get(586).getCompany());
	}

	@Test
	@DisplayName("Record 587: Address is 291 Main St  #-a")
	void AddressOfRecord587() {
		assertEquals("291 Main St  #-a", customers.get(586).getAddress());
	}

	@Test
	@DisplayName("Record 587: City is Hackensack")
	void CityOfRecord587() {
		assertEquals("Hackensack", customers.get(586).getCity());
	}

	@Test
	@DisplayName("Record 587: County is Bergen")
	void CountyOfRecord587() {
		assertEquals("Bergen", customers.get(586).getCounty());
	}

	@Test
	@DisplayName("Record 587: State is NJ")
	void StateOfRecord587() {
		assertEquals("NJ", customers.get(586).getState());
	}

	@Test
	@DisplayName("Record 587: ZIP is 7601")
	void ZIPOfRecord587() {
		assertEquals("7601", customers.get(586).getZIP());
	}

	@Test
	@DisplayName("Record 587: Phone is 201-343-0188")
	void PhoneOfRecord587() {
		assertEquals("201-343-0188", customers.get(586).getPhone());
	}

	@Test
	@DisplayName("Record 587: Fax is 201-343-3193")
	void FaxOfRecord587() {
		assertEquals("201-343-3193", customers.get(586).getFax());
	}

	@Test
	@DisplayName("Record 587: Email is emilia@longin.com")
	void EmailOfRecord587() {
		assertEquals("emilia@longin.com", customers.get(586).getEmail());
	}

	@Test
	@DisplayName("Record 587: Web is http://www.emilialongin.com")
	void WebOfRecord587() {
		assertEquals("http://www.emilialongin.com", customers.get(586).getWeb());
	}
}
