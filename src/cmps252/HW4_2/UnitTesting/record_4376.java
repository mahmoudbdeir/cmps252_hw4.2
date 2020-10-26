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

@Tag("34")
class Record_4376 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4376: FirstName is Aurora")
	void FirstNameOfRecord4376() {
		assertEquals("Aurora", customers.get(4375).getFirstName());
	}

	@Test
	@DisplayName("Record 4376: LastName is Clavin")
	void LastNameOfRecord4376() {
		assertEquals("Clavin", customers.get(4375).getLastName());
	}

	@Test
	@DisplayName("Record 4376: Company is Ohara, Daniel L Esq")
	void CompanyOfRecord4376() {
		assertEquals("Ohara, Daniel L Esq", customers.get(4375).getCompany());
	}

	@Test
	@DisplayName("Record 4376: Address is 1 Seagate")
	void AddressOfRecord4376() {
		assertEquals("1 Seagate", customers.get(4375).getAddress());
	}

	@Test
	@DisplayName("Record 4376: City is Toledo")
	void CityOfRecord4376() {
		assertEquals("Toledo", customers.get(4375).getCity());
	}

	@Test
	@DisplayName("Record 4376: County is Lucas")
	void CountyOfRecord4376() {
		assertEquals("Lucas", customers.get(4375).getCounty());
	}

	@Test
	@DisplayName("Record 4376: State is OH")
	void StateOfRecord4376() {
		assertEquals("OH", customers.get(4375).getState());
	}

	@Test
	@DisplayName("Record 4376: ZIP is 43604")
	void ZIPOfRecord4376() {
		assertEquals("43604", customers.get(4375).getZIP());
	}

	@Test
	@DisplayName("Record 4376: Phone is 419-247-0860")
	void PhoneOfRecord4376() {
		assertEquals("419-247-0860", customers.get(4375).getPhone());
	}

	@Test
	@DisplayName("Record 4376: Fax is 419-247-6258")
	void FaxOfRecord4376() {
		assertEquals("419-247-6258", customers.get(4375).getFax());
	}

	@Test
	@DisplayName("Record 4376: Email is aurora@clavin.com")
	void EmailOfRecord4376() {
		assertEquals("aurora@clavin.com", customers.get(4375).getEmail());
	}

	@Test
	@DisplayName("Record 4376: Web is http://www.auroraclavin.com")
	void WebOfRecord4376() {
		assertEquals("http://www.auroraclavin.com", customers.get(4375).getWeb());
	}
}
