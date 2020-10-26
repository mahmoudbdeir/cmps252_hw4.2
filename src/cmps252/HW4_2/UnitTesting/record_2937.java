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

@Tag("41")
class Record_2937 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2937: FirstName is Janis")
	void FirstNameOfRecord2937() {
		assertEquals("Janis", customers.get(2936).getFirstName());
	}

	@Test
	@DisplayName("Record 2937: LastName is Sheridon")
	void LastNameOfRecord2937() {
		assertEquals("Sheridon", customers.get(2936).getLastName());
	}

	@Test
	@DisplayName("Record 2937: Company is Hornall Anderson Dsgn Wks Inc")
	void CompanyOfRecord2937() {
		assertEquals("Hornall Anderson Dsgn Wks Inc", customers.get(2936).getCompany());
	}

	@Test
	@DisplayName("Record 2937: Address is 9109 Dyer St")
	void AddressOfRecord2937() {
		assertEquals("9109 Dyer St", customers.get(2936).getAddress());
	}

	@Test
	@DisplayName("Record 2937: City is El Paso")
	void CityOfRecord2937() {
		assertEquals("El Paso", customers.get(2936).getCity());
	}

	@Test
	@DisplayName("Record 2937: County is El Paso")
	void CountyOfRecord2937() {
		assertEquals("El Paso", customers.get(2936).getCounty());
	}

	@Test
	@DisplayName("Record 2937: State is TX")
	void StateOfRecord2937() {
		assertEquals("TX", customers.get(2936).getState());
	}

	@Test
	@DisplayName("Record 2937: ZIP is 79924")
	void ZIPOfRecord2937() {
		assertEquals("79924", customers.get(2936).getZIP());
	}

	@Test
	@DisplayName("Record 2937: Phone is 915-751-9479")
	void PhoneOfRecord2937() {
		assertEquals("915-751-9479", customers.get(2936).getPhone());
	}

	@Test
	@DisplayName("Record 2937: Fax is 915-751-5656")
	void FaxOfRecord2937() {
		assertEquals("915-751-5656", customers.get(2936).getFax());
	}

	@Test
	@DisplayName("Record 2937: Email is janis@sheridon.com")
	void EmailOfRecord2937() {
		assertEquals("janis@sheridon.com", customers.get(2936).getEmail());
	}

	@Test
	@DisplayName("Record 2937: Web is http://www.janissheridon.com")
	void WebOfRecord2937() {
		assertEquals("http://www.janissheridon.com", customers.get(2936).getWeb());
	}
}
