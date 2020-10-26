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

@Tag("33")
class Record_624 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 624: FirstName is Trisha")
	void FirstNameOfRecord624() {
		assertEquals("Trisha", customers.get(623).getFirstName());
	}

	@Test
	@DisplayName("Record 624: LastName is Faggs")
	void LastNameOfRecord624() {
		assertEquals("Faggs", customers.get(623).getLastName());
	}

	@Test
	@DisplayName("Record 624: Company is General Fryght")
	void CompanyOfRecord624() {
		assertEquals("General Fryght", customers.get(623).getCompany());
	}

	@Test
	@DisplayName("Record 624: Address is 8215 Beech Ave")
	void AddressOfRecord624() {
		assertEquals("8215 Beech Ave", customers.get(623).getAddress());
	}

	@Test
	@DisplayName("Record 624: City is Fontana")
	void CityOfRecord624() {
		assertEquals("Fontana", customers.get(623).getCity());
	}

	@Test
	@DisplayName("Record 624: County is San Bernardino")
	void CountyOfRecord624() {
		assertEquals("San Bernardino", customers.get(623).getCounty());
	}

	@Test
	@DisplayName("Record 624: State is CA")
	void StateOfRecord624() {
		assertEquals("CA", customers.get(623).getState());
	}

	@Test
	@DisplayName("Record 624: ZIP is 92335")
	void ZIPOfRecord624() {
		assertEquals("92335", customers.get(623).getZIP());
	}

	@Test
	@DisplayName("Record 624: Phone is 909-820-9401")
	void PhoneOfRecord624() {
		assertEquals("909-820-9401", customers.get(623).getPhone());
	}

	@Test
	@DisplayName("Record 624: Fax is 909-820-6602")
	void FaxOfRecord624() {
		assertEquals("909-820-6602", customers.get(623).getFax());
	}

	@Test
	@DisplayName("Record 624: Email is trisha@faggs.com")
	void EmailOfRecord624() {
		assertEquals("trisha@faggs.com", customers.get(623).getEmail());
	}

	@Test
	@DisplayName("Record 624: Web is http://www.trishafaggs.com")
	void WebOfRecord624() {
		assertEquals("http://www.trishafaggs.com", customers.get(623).getWeb());
	}
}
