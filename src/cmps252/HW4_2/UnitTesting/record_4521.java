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

@Tag("24")
class Record_4521 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4521: FirstName is Neva")
	void FirstNameOfRecord4521() {
		assertEquals("Neva", customers.get(4520).getFirstName());
	}

	@Test
	@DisplayName("Record 4521: LastName is Montalto")
	void LastNameOfRecord4521() {
		assertEquals("Montalto", customers.get(4520).getLastName());
	}

	@Test
	@DisplayName("Record 4521: Company is Scott, Susan Esq")
	void CompanyOfRecord4521() {
		assertEquals("Scott, Susan Esq", customers.get(4520).getCompany());
	}

	@Test
	@DisplayName("Record 4521: Address is 5626 Riverdale Rd")
	void AddressOfRecord4521() {
		assertEquals("5626 Riverdale Rd", customers.get(4520).getAddress());
	}

	@Test
	@DisplayName("Record 4521: City is Jamestown")
	void CityOfRecord4521() {
		assertEquals("Jamestown", customers.get(4520).getCity());
	}

	@Test
	@DisplayName("Record 4521: County is Guilford")
	void CountyOfRecord4521() {
		assertEquals("Guilford", customers.get(4520).getCounty());
	}

	@Test
	@DisplayName("Record 4521: State is NC")
	void StateOfRecord4521() {
		assertEquals("NC", customers.get(4520).getState());
	}

	@Test
	@DisplayName("Record 4521: ZIP is 27282")
	void ZIPOfRecord4521() {
		assertEquals("27282", customers.get(4520).getZIP());
	}

	@Test
	@DisplayName("Record 4521: Phone is 336-454-7275")
	void PhoneOfRecord4521() {
		assertEquals("336-454-7275", customers.get(4520).getPhone());
	}

	@Test
	@DisplayName("Record 4521: Fax is 336-454-1774")
	void FaxOfRecord4521() {
		assertEquals("336-454-1774", customers.get(4520).getFax());
	}

	@Test
	@DisplayName("Record 4521: Email is neva@montalto.com")
	void EmailOfRecord4521() {
		assertEquals("neva@montalto.com", customers.get(4520).getEmail());
	}

	@Test
	@DisplayName("Record 4521: Web is http://www.nevamontalto.com")
	void WebOfRecord4521() {
		assertEquals("http://www.nevamontalto.com", customers.get(4520).getWeb());
	}
}
