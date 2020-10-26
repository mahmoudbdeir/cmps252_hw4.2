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

@Tag("6")
class Record_4367 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4367: FirstName is Shawn")
	void FirstNameOfRecord4367() {
		assertEquals("Shawn", customers.get(4366).getFirstName());
	}

	@Test
	@DisplayName("Record 4367: LastName is Solan")
	void LastNameOfRecord4367() {
		assertEquals("Solan", customers.get(4366).getLastName());
	}

	@Test
	@DisplayName("Record 4367: Company is Snelbaker, Richard C Esq")
	void CompanyOfRecord4367() {
		assertEquals("Snelbaker, Richard C Esq", customers.get(4366).getCompany());
	}

	@Test
	@DisplayName("Record 4367: Address is 21155 Woodfield Rd")
	void AddressOfRecord4367() {
		assertEquals("21155 Woodfield Rd", customers.get(4366).getAddress());
	}

	@Test
	@DisplayName("Record 4367: City is Gaithersburg")
	void CityOfRecord4367() {
		assertEquals("Gaithersburg", customers.get(4366).getCity());
	}

	@Test
	@DisplayName("Record 4367: County is Montgomery")
	void CountyOfRecord4367() {
		assertEquals("Montgomery", customers.get(4366).getCounty());
	}

	@Test
	@DisplayName("Record 4367: State is MD")
	void StateOfRecord4367() {
		assertEquals("MD", customers.get(4366).getState());
	}

	@Test
	@DisplayName("Record 4367: ZIP is 20882")
	void ZIPOfRecord4367() {
		assertEquals("20882", customers.get(4366).getZIP());
	}

	@Test
	@DisplayName("Record 4367: Phone is 301-869-7252")
	void PhoneOfRecord4367() {
		assertEquals("301-869-7252", customers.get(4366).getPhone());
	}

	@Test
	@DisplayName("Record 4367: Fax is 301-869-4869")
	void FaxOfRecord4367() {
		assertEquals("301-869-4869", customers.get(4366).getFax());
	}

	@Test
	@DisplayName("Record 4367: Email is shawn@solan.com")
	void EmailOfRecord4367() {
		assertEquals("shawn@solan.com", customers.get(4366).getEmail());
	}

	@Test
	@DisplayName("Record 4367: Web is http://www.shawnsolan.com")
	void WebOfRecord4367() {
		assertEquals("http://www.shawnsolan.com", customers.get(4366).getWeb());
	}
}
