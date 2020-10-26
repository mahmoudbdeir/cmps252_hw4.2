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

@Tag("23")
class Record_3315 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3315: FirstName is Oralia")
	void FirstNameOfRecord3315() {
		assertEquals("Oralia", customers.get(3314).getFirstName());
	}

	@Test
	@DisplayName("Record 3315: LastName is Kinnaird")
	void LastNameOfRecord3315() {
		assertEquals("Kinnaird", customers.get(3314).getLastName());
	}

	@Test
	@DisplayName("Record 3315: Company is Austin, Kenneth R Esq")
	void CompanyOfRecord3315() {
		assertEquals("Austin, Kenneth R Esq", customers.get(3314).getCompany());
	}

	@Test
	@DisplayName("Record 3315: Address is 19125 82 Dr")
	void AddressOfRecord3315() {
		assertEquals("19125 82 Dr", customers.get(3314).getAddress());
	}

	@Test
	@DisplayName("Record 3315: City is Muskego")
	void CityOfRecord3315() {
		assertEquals("Muskego", customers.get(3314).getCity());
	}

	@Test
	@DisplayName("Record 3315: County is Waukesha")
	void CountyOfRecord3315() {
		assertEquals("Waukesha", customers.get(3314).getCounty());
	}

	@Test
	@DisplayName("Record 3315: State is WI")
	void StateOfRecord3315() {
		assertEquals("WI", customers.get(3314).getState());
	}

	@Test
	@DisplayName("Record 3315: ZIP is 53150")
	void ZIPOfRecord3315() {
		assertEquals("53150", customers.get(3314).getZIP());
	}

	@Test
	@DisplayName("Record 3315: Phone is 262-422-5291")
	void PhoneOfRecord3315() {
		assertEquals("262-422-5291", customers.get(3314).getPhone());
	}

	@Test
	@DisplayName("Record 3315: Fax is 262-422-2881")
	void FaxOfRecord3315() {
		assertEquals("262-422-2881", customers.get(3314).getFax());
	}

	@Test
	@DisplayName("Record 3315: Email is oralia@kinnaird.com")
	void EmailOfRecord3315() {
		assertEquals("oralia@kinnaird.com", customers.get(3314).getEmail());
	}

	@Test
	@DisplayName("Record 3315: Web is http://www.oraliakinnaird.com")
	void WebOfRecord3315() {
		assertEquals("http://www.oraliakinnaird.com", customers.get(3314).getWeb());
	}
}
