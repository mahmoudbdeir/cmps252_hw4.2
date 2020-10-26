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

@Tag("22")
class Record_133 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 133: FirstName is Olivia")
	void FirstNameOfRecord133() {
		assertEquals("Olivia", customers.get(132).getFirstName());
	}

	@Test
	@DisplayName("Record 133: LastName is Hynzmann")
	void LastNameOfRecord133() {
		assertEquals("Hynzmann", customers.get(132).getLastName());
	}

	@Test
	@DisplayName("Record 133: Company is Essex Mini Storage")
	void CompanyOfRecord133() {
		assertEquals("Essex Mini Storage", customers.get(132).getCompany());
	}

	@Test
	@DisplayName("Record 133: Address is 795 Aladdin Ave")
	void AddressOfRecord133() {
		assertEquals("795 Aladdin Ave", customers.get(132).getAddress());
	}

	@Test
	@DisplayName("Record 133: City is San Leandro")
	void CityOfRecord133() {
		assertEquals("San Leandro", customers.get(132).getCity());
	}

	@Test
	@DisplayName("Record 133: County is Alameda")
	void CountyOfRecord133() {
		assertEquals("Alameda", customers.get(132).getCounty());
	}

	@Test
	@DisplayName("Record 133: State is CA")
	void StateOfRecord133() {
		assertEquals("CA", customers.get(132).getState());
	}

	@Test
	@DisplayName("Record 133: ZIP is 94577")
	void ZIPOfRecord133() {
		assertEquals("94577", customers.get(132).getZIP());
	}

	@Test
	@DisplayName("Record 133: Phone is 510-483-5036")
	void PhoneOfRecord133() {
		assertEquals("510-483-5036", customers.get(132).getPhone());
	}

	@Test
	@DisplayName("Record 133: Fax is 510-483-5543")
	void FaxOfRecord133() {
		assertEquals("510-483-5543", customers.get(132).getFax());
	}

	@Test
	@DisplayName("Record 133: Email is olivia@hynzmann.com")
	void EmailOfRecord133() {
		assertEquals("olivia@hynzmann.com", customers.get(132).getEmail());
	}

	@Test
	@DisplayName("Record 133: Web is http://www.oliviahynzmann.com")
	void WebOfRecord133() {
		assertEquals("http://www.oliviahynzmann.com", customers.get(132).getWeb());
	}
}
