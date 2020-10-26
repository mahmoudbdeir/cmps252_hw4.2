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

@Tag("0")
class Record_4428 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4428: FirstName is Devin")
	void FirstNameOfRecord4428() {
		assertEquals("Devin", customers.get(4427).getFirstName());
	}

	@Test
	@DisplayName("Record 4428: LastName is Fyngold")
	void LastNameOfRecord4428() {
		assertEquals("Fyngold", customers.get(4427).getLastName());
	}

	@Test
	@DisplayName("Record 4428: Company is Boeger, John L Esq")
	void CompanyOfRecord4428() {
		assertEquals("Boeger, John L Esq", customers.get(4427).getCompany());
	}

	@Test
	@DisplayName("Record 4428: Address is 4215 E Brickell St")
	void AddressOfRecord4428() {
		assertEquals("4215 E Brickell St", customers.get(4427).getAddress());
	}

	@Test
	@DisplayName("Record 4428: City is Ontario")
	void CityOfRecord4428() {
		assertEquals("Ontario", customers.get(4427).getCity());
	}

	@Test
	@DisplayName("Record 4428: County is San Bernardino")
	void CountyOfRecord4428() {
		assertEquals("San Bernardino", customers.get(4427).getCounty());
	}

	@Test
	@DisplayName("Record 4428: State is CA")
	void StateOfRecord4428() {
		assertEquals("CA", customers.get(4427).getState());
	}

	@Test
	@DisplayName("Record 4428: ZIP is 91761")
	void ZIPOfRecord4428() {
		assertEquals("91761", customers.get(4427).getZIP());
	}

	@Test
	@DisplayName("Record 4428: Phone is 909-460-9711")
	void PhoneOfRecord4428() {
		assertEquals("909-460-9711", customers.get(4427).getPhone());
	}

	@Test
	@DisplayName("Record 4428: Fax is 909-460-7664")
	void FaxOfRecord4428() {
		assertEquals("909-460-7664", customers.get(4427).getFax());
	}

	@Test
	@DisplayName("Record 4428: Email is devin@fyngold.com")
	void EmailOfRecord4428() {
		assertEquals("devin@fyngold.com", customers.get(4427).getEmail());
	}

	@Test
	@DisplayName("Record 4428: Web is http://www.devinfyngold.com")
	void WebOfRecord4428() {
		assertEquals("http://www.devinfyngold.com", customers.get(4427).getWeb());
	}
}
