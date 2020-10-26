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

@Tag("43")
class Record_3417 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3417: FirstName is Carmen")
	void FirstNameOfRecord3417() {
		assertEquals("Carmen", customers.get(3416).getFirstName());
	}

	@Test
	@DisplayName("Record 3417: LastName is Schiffer")
	void LastNameOfRecord3417() {
		assertEquals("Schiffer", customers.get(3416).getLastName());
	}

	@Test
	@DisplayName("Record 3417: Company is Barnes, A Parker Jr")
	void CompanyOfRecord3417() {
		assertEquals("Barnes, A Parker Jr", customers.get(3416).getCompany());
	}

	@Test
	@DisplayName("Record 3417: Address is 18840 Parthenia St")
	void AddressOfRecord3417() {
		assertEquals("18840 Parthenia St", customers.get(3416).getAddress());
	}

	@Test
	@DisplayName("Record 3417: City is Northridge")
	void CityOfRecord3417() {
		assertEquals("Northridge", customers.get(3416).getCity());
	}

	@Test
	@DisplayName("Record 3417: County is Los Angeles")
	void CountyOfRecord3417() {
		assertEquals("Los Angeles", customers.get(3416).getCounty());
	}

	@Test
	@DisplayName("Record 3417: State is CA")
	void StateOfRecord3417() {
		assertEquals("CA", customers.get(3416).getState());
	}

	@Test
	@DisplayName("Record 3417: ZIP is 91324")
	void ZIPOfRecord3417() {
		assertEquals("91324", customers.get(3416).getZIP());
	}

	@Test
	@DisplayName("Record 3417: Phone is 818-993-0849")
	void PhoneOfRecord3417() {
		assertEquals("818-993-0849", customers.get(3416).getPhone());
	}

	@Test
	@DisplayName("Record 3417: Fax is 818-993-9491")
	void FaxOfRecord3417() {
		assertEquals("818-993-9491", customers.get(3416).getFax());
	}

	@Test
	@DisplayName("Record 3417: Email is carmen@schiffer.com")
	void EmailOfRecord3417() {
		assertEquals("carmen@schiffer.com", customers.get(3416).getEmail());
	}

	@Test
	@DisplayName("Record 3417: Web is http://www.carmenschiffer.com")
	void WebOfRecord3417() {
		assertEquals("http://www.carmenschiffer.com", customers.get(3416).getWeb());
	}
}
