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
class Record_3408 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3408: FirstName is Faith")
	void FirstNameOfRecord3408() {
		assertEquals("Faith", customers.get(3407).getFirstName());
	}

	@Test
	@DisplayName("Record 3408: LastName is Jorgensen")
	void LastNameOfRecord3408() {
		assertEquals("Jorgensen", customers.get(3407).getLastName());
	}

	@Test
	@DisplayName("Record 3408: Company is Taylor, Donna M Esq")
	void CompanyOfRecord3408() {
		assertEquals("Taylor, Donna M Esq", customers.get(3407).getCompany());
	}

	@Test
	@DisplayName("Record 3408: Address is 1918 Bonita Ave")
	void AddressOfRecord3408() {
		assertEquals("1918 Bonita Ave", customers.get(3407).getAddress());
	}

	@Test
	@DisplayName("Record 3408: City is Berkeley")
	void CityOfRecord3408() {
		assertEquals("Berkeley", customers.get(3407).getCity());
	}

	@Test
	@DisplayName("Record 3408: County is Alameda")
	void CountyOfRecord3408() {
		assertEquals("Alameda", customers.get(3407).getCounty());
	}

	@Test
	@DisplayName("Record 3408: State is CA")
	void StateOfRecord3408() {
		assertEquals("CA", customers.get(3407).getState());
	}

	@Test
	@DisplayName("Record 3408: ZIP is 94704")
	void ZIPOfRecord3408() {
		assertEquals("94704", customers.get(3407).getZIP());
	}

	@Test
	@DisplayName("Record 3408: Phone is 510-540-6865")
	void PhoneOfRecord3408() {
		assertEquals("510-540-6865", customers.get(3407).getPhone());
	}

	@Test
	@DisplayName("Record 3408: Fax is 510-540-6403")
	void FaxOfRecord3408() {
		assertEquals("510-540-6403", customers.get(3407).getFax());
	}

	@Test
	@DisplayName("Record 3408: Email is faith@jorgensen.com")
	void EmailOfRecord3408() {
		assertEquals("faith@jorgensen.com", customers.get(3407).getEmail());
	}

	@Test
	@DisplayName("Record 3408: Web is http://www.faithjorgensen.com")
	void WebOfRecord3408() {
		assertEquals("http://www.faithjorgensen.com", customers.get(3407).getWeb());
	}
}
