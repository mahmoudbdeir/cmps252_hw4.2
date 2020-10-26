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

@Tag("45")
class Record_4396 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4396: FirstName is Mauro")
	void FirstNameOfRecord4396() {
		assertEquals("Mauro", customers.get(4395).getFirstName());
	}

	@Test
	@DisplayName("Record 4396: LastName is Flenniken")
	void LastNameOfRecord4396() {
		assertEquals("Flenniken", customers.get(4395).getLastName());
	}

	@Test
	@DisplayName("Record 4396: Company is Intrntl Staple & Mach Co High")
	void CompanyOfRecord4396() {
		assertEquals("Intrntl Staple & Mach Co High", customers.get(4395).getCompany());
	}

	@Test
	@DisplayName("Record 4396: Address is 3722 Lonsdale St")
	void AddressOfRecord4396() {
		assertEquals("3722 Lonsdale St", customers.get(4395).getAddress());
	}

	@Test
	@DisplayName("Record 4396: City is Cincinnati")
	void CityOfRecord4396() {
		assertEquals("Cincinnati", customers.get(4395).getCity());
	}

	@Test
	@DisplayName("Record 4396: County is Hamilton")
	void CountyOfRecord4396() {
		assertEquals("Hamilton", customers.get(4395).getCounty());
	}

	@Test
	@DisplayName("Record 4396: State is OH")
	void StateOfRecord4396() {
		assertEquals("OH", customers.get(4395).getState());
	}

	@Test
	@DisplayName("Record 4396: ZIP is 45227")
	void ZIPOfRecord4396() {
		assertEquals("45227", customers.get(4395).getZIP());
	}

	@Test
	@DisplayName("Record 4396: Phone is 513-271-9877")
	void PhoneOfRecord4396() {
		assertEquals("513-271-9877", customers.get(4395).getPhone());
	}

	@Test
	@DisplayName("Record 4396: Fax is 513-271-1543")
	void FaxOfRecord4396() {
		assertEquals("513-271-1543", customers.get(4395).getFax());
	}

	@Test
	@DisplayName("Record 4396: Email is mauro@flenniken.com")
	void EmailOfRecord4396() {
		assertEquals("mauro@flenniken.com", customers.get(4395).getEmail());
	}

	@Test
	@DisplayName("Record 4396: Web is http://www.mauroflenniken.com")
	void WebOfRecord4396() {
		assertEquals("http://www.mauroflenniken.com", customers.get(4395).getWeb());
	}
}
