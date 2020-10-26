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

@Tag("20")
class Record_4726 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4726: FirstName is Maria")
	void FirstNameOfRecord4726() {
		assertEquals("Maria", customers.get(4725).getFirstName());
	}

	@Test
	@DisplayName("Record 4726: LastName is Waibel")
	void LastNameOfRecord4726() {
		assertEquals("Waibel", customers.get(4725).getLastName());
	}

	@Test
	@DisplayName("Record 4726: Company is Alden Advtsng & Pr Agcy Inc")
	void CompanyOfRecord4726() {
		assertEquals("Alden Advtsng & Pr Agcy Inc", customers.get(4725).getCompany());
	}

	@Test
	@DisplayName("Record 4726: Address is 50 Tice Blvd")
	void AddressOfRecord4726() {
		assertEquals("50 Tice Blvd", customers.get(4725).getAddress());
	}

	@Test
	@DisplayName("Record 4726: City is Westwood")
	void CityOfRecord4726() {
		assertEquals("Westwood", customers.get(4725).getCity());
	}

	@Test
	@DisplayName("Record 4726: County is Bergen")
	void CountyOfRecord4726() {
		assertEquals("Bergen", customers.get(4725).getCounty());
	}

	@Test
	@DisplayName("Record 4726: State is NJ")
	void StateOfRecord4726() {
		assertEquals("NJ", customers.get(4725).getState());
	}

	@Test
	@DisplayName("Record 4726: ZIP is 7675")
	void ZIPOfRecord4726() {
		assertEquals("7675", customers.get(4725).getZIP());
	}

	@Test
	@DisplayName("Record 4726: Phone is 201-391-2191")
	void PhoneOfRecord4726() {
		assertEquals("201-391-2191", customers.get(4725).getPhone());
	}

	@Test
	@DisplayName("Record 4726: Fax is 201-391-1563")
	void FaxOfRecord4726() {
		assertEquals("201-391-1563", customers.get(4725).getFax());
	}

	@Test
	@DisplayName("Record 4726: Email is maria@waibel.com")
	void EmailOfRecord4726() {
		assertEquals("maria@waibel.com", customers.get(4725).getEmail());
	}

	@Test
	@DisplayName("Record 4726: Web is http://www.mariawaibel.com")
	void WebOfRecord4726() {
		assertEquals("http://www.mariawaibel.com", customers.get(4725).getWeb());
	}
}
