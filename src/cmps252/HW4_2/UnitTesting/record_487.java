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

@Tag("45")
class Record_487 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 487: FirstName is Eliseo")
	void FirstNameOfRecord487() {
		assertEquals("Eliseo", customers.get(486).getFirstName());
	}

	@Test
	@DisplayName("Record 487: LastName is Finzel")
	void LastNameOfRecord487() {
		assertEquals("Finzel", customers.get(486).getLastName());
	}

	@Test
	@DisplayName("Record 487: Company is Applied Solar Energy Corp")
	void CompanyOfRecord487() {
		assertEquals("Applied Solar Energy Corp", customers.get(486).getCompany());
	}

	@Test
	@DisplayName("Record 487: Address is 1660 White Ln")
	void AddressOfRecord487() {
		assertEquals("1660 White Ln", customers.get(486).getAddress());
	}

	@Test
	@DisplayName("Record 487: City is Stockton")
	void CityOfRecord487() {
		assertEquals("Stockton", customers.get(486).getCity());
	}

	@Test
	@DisplayName("Record 487: County is San Joaquin")
	void CountyOfRecord487() {
		assertEquals("San Joaquin", customers.get(486).getCounty());
	}

	@Test
	@DisplayName("Record 487: State is CA")
	void StateOfRecord487() {
		assertEquals("CA", customers.get(486).getState());
	}

	@Test
	@DisplayName("Record 487: ZIP is 95215")
	void ZIPOfRecord487() {
		assertEquals("95215", customers.get(486).getZIP());
	}

	@Test
	@DisplayName("Record 487: Phone is 209-931-8532")
	void PhoneOfRecord487() {
		assertEquals("209-931-8532", customers.get(486).getPhone());
	}

	@Test
	@DisplayName("Record 487: Fax is 209-931-4708")
	void FaxOfRecord487() {
		assertEquals("209-931-4708", customers.get(486).getFax());
	}

	@Test
	@DisplayName("Record 487: Email is eliseo@finzel.com")
	void EmailOfRecord487() {
		assertEquals("eliseo@finzel.com", customers.get(486).getEmail());
	}

	@Test
	@DisplayName("Record 487: Web is http://www.eliseofinzel.com")
	void WebOfRecord487() {
		assertEquals("http://www.eliseofinzel.com", customers.get(486).getWeb());
	}
}
