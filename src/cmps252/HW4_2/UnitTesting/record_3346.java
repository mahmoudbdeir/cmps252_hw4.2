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
class Record_3346 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3346: FirstName is Samatha")
	void FirstNameOfRecord3346() {
		assertEquals("Samatha", customers.get(3345).getFirstName());
	}

	@Test
	@DisplayName("Record 3346: LastName is Vasallo")
	void LastNameOfRecord3346() {
		assertEquals("Vasallo", customers.get(3345).getLastName());
	}

	@Test
	@DisplayName("Record 3346: Company is Carols Copy Center")
	void CompanyOfRecord3346() {
		assertEquals("Carols Copy Center", customers.get(3345).getCompany());
	}

	@Test
	@DisplayName("Record 3346: Address is 62 N Broad St")
	void AddressOfRecord3346() {
		assertEquals("62 N Broad St", customers.get(3345).getAddress());
	}

	@Test
	@DisplayName("Record 3346: City is Deptford")
	void CityOfRecord3346() {
		assertEquals("Deptford", customers.get(3345).getCity());
	}

	@Test
	@DisplayName("Record 3346: County is Gloucester")
	void CountyOfRecord3346() {
		assertEquals("Gloucester", customers.get(3345).getCounty());
	}

	@Test
	@DisplayName("Record 3346: State is NJ")
	void StateOfRecord3346() {
		assertEquals("NJ", customers.get(3345).getState());
	}

	@Test
	@DisplayName("Record 3346: ZIP is 8096")
	void ZIPOfRecord3346() {
		assertEquals("8096", customers.get(3345).getZIP());
	}

	@Test
	@DisplayName("Record 3346: Phone is 856-848-9909")
	void PhoneOfRecord3346() {
		assertEquals("856-848-9909", customers.get(3345).getPhone());
	}

	@Test
	@DisplayName("Record 3346: Fax is 856-848-9488")
	void FaxOfRecord3346() {
		assertEquals("856-848-9488", customers.get(3345).getFax());
	}

	@Test
	@DisplayName("Record 3346: Email is samatha@vasallo.com")
	void EmailOfRecord3346() {
		assertEquals("samatha@vasallo.com", customers.get(3345).getEmail());
	}

	@Test
	@DisplayName("Record 3346: Web is http://www.samathavasallo.com")
	void WebOfRecord3346() {
		assertEquals("http://www.samathavasallo.com", customers.get(3345).getWeb());
	}
}
