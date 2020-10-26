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

@Tag("8")
class Record_4683 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4683: FirstName is Maricela")
	void FirstNameOfRecord4683() {
		assertEquals("Maricela", customers.get(4682).getFirstName());
	}

	@Test
	@DisplayName("Record 4683: LastName is Hoopii")
	void LastNameOfRecord4683() {
		assertEquals("Hoopii", customers.get(4682).getLastName());
	}

	@Test
	@DisplayName("Record 4683: Company is Padua Fedrl Credit Union")
	void CompanyOfRecord4683() {
		assertEquals("Padua Fedrl Credit Union", customers.get(4682).getCompany());
	}

	@Test
	@DisplayName("Record 4683: Address is 3525 1st St")
	void AddressOfRecord4683() {
		assertEquals("3525 1st St", customers.get(4682).getAddress());
	}

	@Test
	@DisplayName("Record 4683: City is Livermore")
	void CityOfRecord4683() {
		assertEquals("Livermore", customers.get(4682).getCity());
	}

	@Test
	@DisplayName("Record 4683: County is Alameda")
	void CountyOfRecord4683() {
		assertEquals("Alameda", customers.get(4682).getCounty());
	}

	@Test
	@DisplayName("Record 4683: State is CA")
	void StateOfRecord4683() {
		assertEquals("CA", customers.get(4682).getState());
	}

	@Test
	@DisplayName("Record 4683: ZIP is 94550")
	void ZIPOfRecord4683() {
		assertEquals("94550", customers.get(4682).getZIP());
	}

	@Test
	@DisplayName("Record 4683: Phone is 925-443-8825")
	void PhoneOfRecord4683() {
		assertEquals("925-443-8825", customers.get(4682).getPhone());
	}

	@Test
	@DisplayName("Record 4683: Fax is 925-443-1879")
	void FaxOfRecord4683() {
		assertEquals("925-443-1879", customers.get(4682).getFax());
	}

	@Test
	@DisplayName("Record 4683: Email is maricela@hoopii.com")
	void EmailOfRecord4683() {
		assertEquals("maricela@hoopii.com", customers.get(4682).getEmail());
	}

	@Test
	@DisplayName("Record 4683: Web is http://www.maricelahoopii.com")
	void WebOfRecord4683() {
		assertEquals("http://www.maricelahoopii.com", customers.get(4682).getWeb());
	}
}
