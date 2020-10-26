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

@Tag("18")
class Record_3745 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3745: FirstName is Jackie")
	void FirstNameOfRecord3745() {
		assertEquals("Jackie", customers.get(3744).getFirstName());
	}

	@Test
	@DisplayName("Record 3745: LastName is Dinicola")
	void LastNameOfRecord3745() {
		assertEquals("Dinicola", customers.get(3744).getLastName());
	}

	@Test
	@DisplayName("Record 3745: Company is Oconto Electric Cooperative")
	void CompanyOfRecord3745() {
		assertEquals("Oconto Electric Cooperative", customers.get(3744).getCompany());
	}

	@Test
	@DisplayName("Record 3745: Address is 200145 Winchester")
	void AddressOfRecord3745() {
		assertEquals("200145 Winchester", customers.get(3744).getAddress());
	}

	@Test
	@DisplayName("Record 3745: City is Baltimore")
	void CityOfRecord3745() {
		assertEquals("Baltimore", customers.get(3744).getCity());
	}

	@Test
	@DisplayName("Record 3745: County is Baltimore City")
	void CountyOfRecord3745() {
		assertEquals("Baltimore City", customers.get(3744).getCounty());
	}

	@Test
	@DisplayName("Record 3745: State is MD")
	void StateOfRecord3745() {
		assertEquals("MD", customers.get(3744).getState());
	}

	@Test
	@DisplayName("Record 3745: ZIP is 21223")
	void ZIPOfRecord3745() {
		assertEquals("21223", customers.get(3744).getZIP());
	}

	@Test
	@DisplayName("Record 3745: Phone is 410-669-7799")
	void PhoneOfRecord3745() {
		assertEquals("410-669-7799", customers.get(3744).getPhone());
	}

	@Test
	@DisplayName("Record 3745: Fax is 410-669-7679")
	void FaxOfRecord3745() {
		assertEquals("410-669-7679", customers.get(3744).getFax());
	}

	@Test
	@DisplayName("Record 3745: Email is jackie@dinicola.com")
	void EmailOfRecord3745() {
		assertEquals("jackie@dinicola.com", customers.get(3744).getEmail());
	}

	@Test
	@DisplayName("Record 3745: Web is http://www.jackiedinicola.com")
	void WebOfRecord3745() {
		assertEquals("http://www.jackiedinicola.com", customers.get(3744).getWeb());
	}
}
